package mobi.MobiSeeker.sQueue.activites;

import java.util.HashMap;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.WindowManager;

import mobi.MobiSeeker.sQueue.connection.IChordServiceListener;

/*
 * First Commit from youssef
 * */

public abstract class BaseActivity extends FragmentActivity implements
		IChordServiceListener {

	static FragmentActivity currentRoboActivity;

	public static void setCurrentRoboActivity(
			FragmentActivity _currentRoboActivity) {
		currentRoboActivity = _currentRoboActivity;
	}

	public static HashMap<String, String> Nodes = new HashMap<String, String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}

	@Override
	public void onReceiveMessage(String node, String channel, String message,
			String MessageType) {
		// TODO Auto-generated method stub


	}
	
	
	public void checkActivity()
	{

	}
	
	public void stopAlaram()
	{
		
	}
	

	
	@Override
	public void finish() {
		// TODO Auto-generated method stub
		super.finish();
		stopAlaram();
	}
	
	


}

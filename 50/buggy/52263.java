@java.lang.Override
public void onLocationStoppedSeeking() {
    android.widget.Toast.makeText(mActivity, "Tracking stopped", Toast.LENGTH_SHORT).show();
    android.util.Log.d("LOCATION", "Tracking stopped");
    com.unity3d.player.UnityPlayer.UnitySendMessage("LOCATIONCHECKER", "OnLocationStoppedSeeking", "");
}
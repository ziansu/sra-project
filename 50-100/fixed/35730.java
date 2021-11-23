@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.scooter1556.sms.android.activity.VideoPlaybackActivity.TAG, "onPause() was called");
    if ((seekbarTimer) != null) {
        seekbarTimer.cancel();
        seekbarTimer = null;
    }
    if ((controllersTimer) != null) {
        controllersTimer.cancel();
    }
    pause();
    updatePlayButton();
}
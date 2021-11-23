@java.lang.Override
protected void onPause() {
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mRegistrationBroadcastReceiver);
    stopRepeatingTask();
    super.onPause();
    android.util.Log.d("SCXTT2", " onPause");
    mIsInForegroundMode = false;
    com.harnk.whereru.DeviceSingleton deviceSingleton = com.harnk.whereru.DeviceSingleton.getInstance();
    deviceSingleton.setMapIsActive(false);
    this.unregisterReceiver(mMessageReceiver);
    mIsInForegroundMode = true;
}
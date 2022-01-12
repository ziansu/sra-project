@java.lang.Override
public void onPause() {
    android.util.Log.d(com.dxyh.fqrtmpplayer.FQRtmpPusher.TAG, "onPause");
    mPausing = true;
    mSensorManager.unregisterListener(this);
    stopPreview();
    closeCamera();
    resetScreenOn();
    if (mFirstTimeInitialized) {
        mOrientationListener.disable();
    }
    mHandler.removeMessages(com.dxyh.fqrtmpplayer.FQRtmpPusher.FIRST_TIME_INIT);
}
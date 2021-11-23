@java.lang.Override
public void onPause() {
    android.util.Log.d(com.dxyh.fqrtmpplayer.FQRtmpPusher.TAG, "onPause");
    mPausing = true;
    mSensorManager.unregisterListener(this);
    if (mFirstTimeInitialized) {
        mOrientationListener.disable();
    }
    stopPreview();
    closeCamera();
    resetScreenOn();
    mHandler.removeMessages(com.dxyh.fqrtmpplayer.FQRtmpPusher.FIRST_TIME_INIT);
}
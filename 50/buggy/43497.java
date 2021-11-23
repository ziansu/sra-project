@java.lang.Override
protected void onPause() {
    super.onPause();
    disposeCamera();
    mMySurfaceView.onPause();
    mSensorManager.unregisterListener(mSensorEventListener);
    mIsFirstIn = true;
    if ((com.example.dreamtale.indoornavigator.MainActivity.mActivity) == null) {
        com.example.dreamtale.indoornavigator.MainActivity.mActivity = this;
    }
}
@java.lang.Override
protected void onPause() {
    super.onPause();
    disposeCamera();
    mMySurfaceView.onPause();
    mSensorManager.unregisterListener(mSensorEventListener);
    mIsFirstIn = true;
    com.example.dreamtale.indoornavigator.MainActivity.mActivity = this;
}
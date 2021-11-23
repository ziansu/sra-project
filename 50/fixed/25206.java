@java.lang.Override
protected void onPause() {
    super.onPause();
    if (null != (mSensorManager)) {
        mSensorManager.unregisterListener(mShakeWatcher);
    }
}
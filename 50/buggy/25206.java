@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((mSensorManager) != null) {
        mSensorManager.unregisterListener(mShakeWatcher);
    }
}
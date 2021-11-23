@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.umarbhutta.xlightcompanion.main.SlidingMenuMainActivity.mShakeInfo = null;
    if ((sensorManager) != null) {
        sensorManager.unregisterListener(sensorEventListener);
    }
    com.umarbhutta.xlightcompanion.Tools.SharedPreferencesUtils.putObject(this, SharedPreferencesUtils.KEY_DEVICE_LIST, "");
}
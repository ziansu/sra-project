@java.lang.Override
protected void onPause() {
    super.onPause();
    sensorManager.unregisterListener(this);
}
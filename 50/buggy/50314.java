@java.lang.Override
protected void onStop() {
    super.onPause();
    sensorManager.unregisterListener(this);
}
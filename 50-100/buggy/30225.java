@java.lang.Override
protected void onDestroy() {
    stopServices();
    sensorManager.unregisterListener(this);
    try {
        if ((locManager) != null) {
            locManager.removeUpdates(locListener);
        }
    } catch (java.lang.SecurityException e) {
        e.printStackTrace();
    }
    wakeLock.release();
    super.onDestroy();
}
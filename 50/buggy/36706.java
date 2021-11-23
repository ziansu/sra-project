public void stopAccelerometer() {
    mSensorManager.unregisterListener(this);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN_MR2)) {
        sensorHandlerThread.quitSafely();
    }else {
        sensorHandlerThread.quit();
    }
}
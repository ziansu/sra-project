public void stopSensor() {
    if ((mProximitySensor) != null) {
        mSensorManager.unregisterListener(this);
    }
    if (mWakeLock.isHeld()) {
        mWakeLock.release();
    }
}
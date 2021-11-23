public void resume() {
    org.lasarobotics.vision.android.Sensors.activated = true;
    mSensorManager.registerListener(this, mAccelerometer, org.lasarobotics.vision.android.Sensors.READ_SPEED);
    mSensorManager.registerListener(this, mMagneticField, org.lasarobotics.vision.android.Sensors.READ_SPEED);
}
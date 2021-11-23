public void resume() {
    if (org.lasarobotics.vision.android.Sensors.activated)
        return ;
    
    org.lasarobotics.vision.android.Sensors.activated = true;
    mSensorManager.registerListener(this, mAccelerometer, org.lasarobotics.vision.android.Sensors.READ_SPEED);
    mSensorManager.registerListener(this, mMagneticField, org.lasarobotics.vision.android.Sensors.READ_SPEED);
}
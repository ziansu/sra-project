@java.lang.Override
public final void onCreate() {
    super.onCreate();
    mSensorManager = ((android.hardware.SensorManager) (getSystemService(this.SENSOR_SERVICE)));
    mAcceleromter = mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
    mSensorManager.registerListener(this, mAcceleromter, GlobalSettings.gAccelEventDelay);
}
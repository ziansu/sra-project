@java.lang.Override
public final void onCreate() {
    super.onCreate();
    android.util.Log.v(is.fb01.tud.university.mobilesurveystud.BackEnd.Service.SensorService.AccelerometerService.TAG, "onServiceConnected");
    mSensorManager = ((android.hardware.SensorManager) (getSystemService(this.SENSOR_SERVICE)));
    mAcceleromter = mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
    mSensorManager.registerListener(this, mAcceleromter, GlobalSettings.gAccelEventDelay);
}
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_orientation_dashboard);
    getActionBar().setDisplayHomeAsUpEnabled(true);
    mSensorManager = ((android.hardware.SensorManager) (getSystemService(com.example.livelyturtle.androidar.SENSOR_SERVICE)));
    mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    mMagneticField = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
}
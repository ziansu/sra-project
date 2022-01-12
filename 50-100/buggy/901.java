@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_server);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    com.gruppe4.menschaergerdichnicht.MenschAergerDIchNicht myLibgdx = new com.gruppe4.menschaergerdichnicht.MenschAergerDIchNicht();
    myLibgdx.setMyAndroidCallBack(this);
    myGameCallBack = myLibgdx;
    initialize(myLibgdx, config);
    mSensorManager = ((android.hardware.SensorManager) (getSystemService(Context.SENSOR_SERVICE)));
    mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    mAccel = 0.0F;
    mAccelCurrent = android.hardware.SensorManager.GRAVITY_EARTH;
    mAccelLast = android.hardware.SensorManager.GRAVITY_EARTH;
}
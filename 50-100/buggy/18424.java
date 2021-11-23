public void startAccelerometer() {
    sensorHandlerThread = new android.os.HandlerThread("AccelerometerSensorThread");
    sensorHandlerThread.start();
    sensorHandler = new android.os.Handler(sensorHandlerThread.getLooper());
    mSensorManager = ((android.hardware.SensorManager) (getSystemService(in.ac.iitb.cse.carts.safestreet.service.SENSOR_SERVICE)));
    mAccelerometerSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    mSensorManager.registerListener(this, mAccelerometerSensor, SensorManager.SENSOR_DELAY_GAME, sensorHandler);
    android.util.Log.d(TAG, ("startAccelerometer Thread name" + (java.lang.Thread.currentThread().getName())));
}
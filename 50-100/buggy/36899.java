@java.lang.Override
protected void onResume() {
    super.onResume();
    sManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_UI);
    sManager.registerListener(this, magnetometer, SensorManager.SENSOR_DELAY_UI);
    mSocket.on("connectOK", onConnectOK);
    mSocket.connect();
}
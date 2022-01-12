public void run() {
    if ((mConnection.isConnected()) && (sensorsRegistered)) {
        com.eclubprague.iot.android.driothub.cloud.sensors.supports.WSDataWrapper data = new com.eclubprague.iot.android.driothub.cloud.sensors.supports.WSDataWrapper(getBuiltInSensors(), THISHUB.getUuid());
        android.util.Log.e("WSDATA", data.toString());
        mConnection.sendTextMessage(data.toString());
    }
}
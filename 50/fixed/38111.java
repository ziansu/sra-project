public void stopPedometerEvent() {
    com.samsung.android.sdk.remotesensor.SrsRemoteSensor sensor;
    sensor = pedoSensorList.get(0);
    appsandmaps.temple.edu.self.MainActivity.mServiceManager.unregisterListener(this, sensor);
}
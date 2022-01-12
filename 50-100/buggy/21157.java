@java.lang.Override
protected void onResume() {
    super.onResume();
    setUpMapIfNeeded();
    if (mGoogleApiClient.isConnected()) {
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, locationRequest, this);
        android.util.Log.d("onResume", "Location update resumed .....................");
    }
    sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    sensorManager.registerListener(this, magnetometer, SensorManager.SENSOR_DELAY_NORMAL);
}
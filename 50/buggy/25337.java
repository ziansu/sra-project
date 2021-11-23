@java.lang.Override
public void onPause() {
    super.onPause();
    stopRepeatingTask();
    locationManager.removeUpdates(gpsLocationListener);
    locationManager.removeGpsStatusListener(mGPSStatusListener);
    dbDataCapture.close();
}
@java.lang.Override
public void onPause() {
    super.onPause();
    locationManager.removeUpdates(gpsLocationListener);
    locationManager.removeGpsStatusListener(mGPSStatusListener);
    dbDataCapture.close();
}
@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((useExternalGpsDevice) >= 1) {
        gps.stopPolling();
        gps = null;
    }else {
        locationManager.removeUpdates(locationListener);
        locationManager = null;
    }
}
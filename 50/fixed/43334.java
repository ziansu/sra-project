@java.lang.Override
public void stopSensing() {
    if (googleApiClient.isConnected()) {
        LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this);
        googleApiClient.disconnect();
    }
    active = false;
    stopAlarms();
    stopPolling();
}
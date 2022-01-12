protected void stopLocationUpdates() {
    if (gapiClient.isConnected()) {
        com.google.android.gms.location.LocationServices.FusedLocationApi.removeLocationUpdates(gapiClient, this);
    }
}
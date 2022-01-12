@java.lang.Override
protected void onStop() {
    super.onStop();
    LocationServices.FusedLocationApi.removeLocationUpdates(lostApiClient, this);
    if (lostApiClient.isConnected()) {
        lostApiClient.unregisterConnectionCallbacks(this);
        lostApiClient.disconnect();
    }
    mapView.onStop();
}
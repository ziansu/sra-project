@java.lang.Override
protected void onStop() {
    super.onStop();
    if (lostApiClient.isConnected()) {
        LocationServices.FusedLocationApi.removeLocationUpdates(lostApiClient, this);
        lostApiClient.unregisterConnectionCallbacks(this);
        lostApiClient.disconnect();
    }
    mapView.onStop();
}
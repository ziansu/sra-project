@java.lang.Override
public void onPause() {
    super.onPause();
    if ((markerTarget) != null) {
        markerTarget.remove();
    }
    if (((googleApiClient) != null) && (googleApiClient.isConnected())) {
        LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this);
    }
    setPoiAddingMode(false);
    activityConnector.dismissConfirmAddPoiWindow();
    if ((googleMap) != null) {
        googleMap.setOnMarkerClickListener(this);
    }
}
protected void onStop() {
    LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, ((com.google.android.gms.location.LocationListener) (this)));
    if ((mGoogleApiClient) != null) {
        mGoogleApiClient.disconnect();
    }
    super.onStop();
}
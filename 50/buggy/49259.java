@java.lang.Override
public void onPause() {
    super.onPause();
    if ((mGoogleApiClient) != null) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
    }
}
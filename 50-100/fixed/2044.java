@java.lang.Override
public void onPause() {
    super.onPause();
    mGoogleApiClient.disconnect();
    try {
        if ((googleMap) != null) {
            googleMap.setMyLocationEnabled(false);
        }
    } catch (java.lang.SecurityException e) {
        requestLocationPermission();
    }
}
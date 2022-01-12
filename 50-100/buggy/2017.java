@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    try {
        busLocationRequest();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if (checkUserLocationPermission()) {
            buildGoogleApiClient();
            mMap.setMyLocationEnabled(true);
        }
    }else {
        buildGoogleApiClient();
        mMap.setMyLocationEnabled(true);
    }
    refreshButton.setVisibility(View.VISIBLE);
}
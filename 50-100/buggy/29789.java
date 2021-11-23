@java.lang.Override
@java.lang.SuppressWarnings(value = { "MissingPermission" })
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    if (doWeHavePermission()) {
        mMap.setMyLocationEnabled(true);
        mMap.setOnCameraChangeListener(this);
        mMap.setPadding(0, 0, com.pokescanner.helper.DrawableUtils.convertToPixels(this, 36), 0);
        android.location.Criteria criteria = new android.location.Criteria();
        java.lang.String provider = locationManager.getBestProvider(criteria, true);
        currentLocation = locationManager.getLastKnownLocation(provider);
        centerCamera();
        startRefresher();
    }
}
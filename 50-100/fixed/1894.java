@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mLocManager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    mMyLocation = getLocation();
    if ((mMyLocation) != null) {
        moveToLocation(mMyLocation);
        createMarkerList();
        placeMarkers();
    }
    initMap();
}
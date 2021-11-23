@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mLocManager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    mMyLocation = getLocation();
    if ((mMyLocation) != null) {
        moveToLocation(mMyLocation);
        mCollection = com.magpie.magpie.CollectionUtils.Collection.collectionTestBuilder(mMyLocation.getLatitude(), mMyLocation.getLongitude());
        createMarkerList();
        placeMarkers();
    }
    initMap();
}
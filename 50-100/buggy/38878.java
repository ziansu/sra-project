@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mLocManager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    mMyLocation = getLocation();
    if ((mMyLocation) != null) {
        moveToLocation(mMyLocation);
        setActiveCollection(com.magpie.magpie.CollectionUtils.Collection.collectionTestBuilder("Test Collection", mMyLocation.getLatitude(), mMyLocation.getLongitude()));
        createMarkerList();
        placeMarkers();
    }
    initMap();
}
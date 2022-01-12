@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    mMap = map;
    updateLocationUI();
    getDeviceLocation();
    MyCurrentLat = mLastKnownLocation.getLatitude();
    MyCurrentLong = mLastKnownLocation.getLongitude();
    com.google.android.gms.maps.model.LatLng MyCurrentLocation = new com.google.android.gms.maps.model.LatLng(MyCurrentLat, MyCurrentLong);
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(MyCurrentLocation).title("Ma Position Actuelle"));
    android.support.v4.app.LoaderManager loaderManager = getSupportLoaderManager();
    loaderManager.restartLoader(be.ecam.mapeza.mapeza.MapsActivityCurrentPlace.QUERY_LOADER, queryURL, this);
}
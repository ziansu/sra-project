public void toggleMapType() {
    if ((mMap.getMapType()) == (com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE)) {
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }else {
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
}
@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    android.location.Location myLoc = map.getMyLocation();
    lat = myLoc.getLatitude();
    lon = myLoc.getLongitude();
    map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(0, 0)).title("Marker"));
    map.setMyLocationEnabled(true);
    android.location.Location myLocation = map.getMyLocation();
}
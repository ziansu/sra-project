@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(0, 0)).title("Marker"));
    map.setMyLocationEnabled(true);
    android.location.Location myLocation = map.getMyLocation();
}
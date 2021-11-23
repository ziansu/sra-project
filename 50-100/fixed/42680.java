@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    map = googleMap;
    map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    com.google.android.gms.maps.model.LatLng startingPoint = new com.google.android.gms.maps.model.LatLng(38.946165, (-92.330937));
    map.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(startingPoint));
    map.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(18));
}
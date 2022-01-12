@java.lang.Override
public void onMapReady(com.example.Googlemap.GoogleMap map) {
    com.google.android.gms.maps.model.LatLng Geneva = new com.google.android.gms.maps.model.LatLng(46.2, 6.15);
    map.moveCamera(com.example.Googlemap.CameraUpdateFactory.newLatLngZoom(Geneva, 10));
    map.setMyLocationEnabled(true);
    map.getUiSettings().setZoomControlsEnabled(true);
    map.getUiSettings().setCompassEnabled(true);
    map.getUiSettings().setMapToolbarEnabled(true);
    map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().title("Geneva").snippet("Best city so far").position(Geneva));
}
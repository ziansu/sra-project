@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.d("app", "map ready");
    map = googleMap;
    map.setOnMyLocationButtonClickListener(this);
    map.setOnMarkerClickListener(this);
    if (debug) {
        com.google.android.gms.maps.model.LatLng SWEDEN = new com.google.android.gms.maps.model.LatLng(62.2315, 16.1932);
        map.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(SWEDEN, 4.5F));
    }
}
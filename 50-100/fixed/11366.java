@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    com.google.android.gms.maps.model.LatLng loyola = new com.google.android.gms.maps.model.LatLng(41.998, (-87.659));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(loyola, ((float) (15.5))));
    if (checkPermissions()) {
        setMyLocationEnabled();
    }
}
@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    com.google.android.gms.maps.model.LatLng loyola = new com.google.android.gms.maps.model.LatLng(41.998, (-87.659));
    double maxZoom = 15.5;
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(loyola, ((float) (maxZoom))));
    if (checkPermissions()) {
        setMyLocationEnabled();
    }
}
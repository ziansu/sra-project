@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(userLocation.getLatitude(), userLocation.getLongitude())).title("You"));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(userLocation.getLatitude(), userLocation.getLongitude()), 7));
    mMap.setOnCameraIdleListener(new com.deveire.dev.truckytrack.ManagerActivity.mapScrolledListener());
    updateMap();
}
@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap mMap) {
    googleMap = mMap;
    googleMap.setMyLocationEnabled(true);
    com.google.android.gms.maps.model.LatLng location = new com.google.android.gms.maps.model.LatLng(40.18659663201023, 44.5089211251659);
    googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(location));
    com.google.android.gms.maps.model.CameraPosition cameraPosition = new com.google.android.gms.maps.model.CameraPosition.Builder().target(location).zoom(17).build();
    googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(cameraPosition));
}
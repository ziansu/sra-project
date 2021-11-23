@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    double latitude = location.getLatitude();
    double longitude = location.getLongitude();
    mLatLng = new com.google.android.gms.maps.model.LatLng(latitude, longitude);
    com.google.android.gms.maps.model.CameraPosition cameraPosition = new com.google.android.gms.maps.model.CameraPosition.Builder().target(mLatLng).zoom(18).build();
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(cameraPosition));
}
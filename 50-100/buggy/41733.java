@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(loc.getLatitude(), loc.getLongitude());
    com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, 10);
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng).title("Twoja pozycja"));
    mMap.animateCamera(cameraUpdate);
    mMap.clear();
}
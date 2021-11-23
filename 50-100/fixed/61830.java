@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    com.google.android.gms.maps.model.LatLng position = new com.google.android.gms.maps.model.LatLng(java.lang.Double.valueOf(latitude), java.lang.Double.valueOf(longitude));
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(position).title("match was here"));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(position));
}
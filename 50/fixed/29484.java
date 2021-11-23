@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    m = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(currentPos).draggable(false));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(currentPos, 16));
}
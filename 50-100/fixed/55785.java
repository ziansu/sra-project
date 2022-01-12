private void setUpMap() {
    mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(18));
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(STARTING_POINT).title("Texas"));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(STARTING_POINT, 5));
}
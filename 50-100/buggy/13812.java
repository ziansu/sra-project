private void setMapLocation(android.location.Location location) {
    double lat = location.getLatitude();
    double lng = location.getLongitude();
    com.google.android.gms.maps.model.LatLng coords = new com.google.android.gms.maps.model.LatLng(lat, lng);
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(coords));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(coords));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(15));
    updateTextView(lat, lng);
}
public void setMap(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.GoogleMap googleMap, java.lang.String text) {
    com.google.android.gms.maps.model.LatLng mood = latLng;
    googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(mood).title(text));
    googleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(mood));
}
public void setMap(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.GoogleMap googleMap, java.lang.String text) {
    if (latLng == null)
        return ;
    
    googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng).title(text));
    googleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(latLng));
}
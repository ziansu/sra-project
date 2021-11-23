public void Marker(android.os.Bundle result) {
    double lat = result.getDouble("latitude");
    double longit = result.getDouble("longitude");
    com.google.android.gms.maps.model.LatLng itb = new com.google.android.gms.maps.model.LatLng(longit, lat);
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(itb).title("Institut Teknologi Bandung"));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(itb));
    mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(itb, 20.0F));
}
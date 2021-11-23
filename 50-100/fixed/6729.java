private void setUpMap() {
    com.google.android.gms.maps.model.LatLng sydney = new com.google.android.gms.maps.model.LatLng(31.793405, 34.639248);
    mMap.setMyLocationEnabled(true);
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(sydney, 10));
    com.google.android.gms.maps.model.MarkerOptions mMark = new com.google.android.gms.maps.model.MarkerOptions().title("Ashdod").snippet("We want to sell and rent houses here!").position(sydney);
    java.util.List<com.google.android.gms.maps.model.MarkerOptions> markers = new com.sce3.thirdyear.maps.data.MapData().getMarkers();
    for (com.google.android.gms.maps.model.MarkerOptions marker : markers) {
        mMap.addMarker(marker);
    }
}
public void addMarker(java.lang.String title, double longitude, double latitude) {
    myMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().title(title).position(new com.google.android.gms.maps.model.LatLng(longitude, latitude)));
}
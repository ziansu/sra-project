protected void loadMap(com.google.android.gms.maps.GoogleMap googleMap) {
    map = googleMap;
    if ((map) != null) {
        addMarkersToMap();
    }
}
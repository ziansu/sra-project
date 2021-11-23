private void addMarker(com.google.android.gms.maps.GoogleMap map, double lat, double lon, com.whiterabbit.pisabike.model.Station s) {
    mClusterManager.addItem(new com.whiterabbit.pisabike.screens.map.MapItem(s));
}
private void addExistingMarkersToMap() {
    log(("Adding existing markers to the map. poiAdapter size = " + (poiAdapter.getCount())));
    com.google.android.gms.maps.model.Marker marker;
    com.google.android.gms.maps.model.MarkerOptions markerOptions;
    for (com.AYC.canalguide.canalparser.MapMarker mapMarker : poiAdapter) {
        if (markersNotFilteredOut(mapMarker)) {
            markerOptions = mapMarker.getMarkerOptions();
            if ((markerOptions != null) && (mapMarker != null)) {
                marker = mMap.addMarker(markerOptions);
                mapMarker.setMarker(marker);
            }
        }
    }
}
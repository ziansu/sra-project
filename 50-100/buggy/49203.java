public void displayFloorLinesAndMarkers(java.lang.Integer floorID, boolean visibility) {
    java.util.List<com.google.android.gms.maps.model.Polyline> floorLines = floorLineMap.get(floorID);
    java.util.List<com.google.android.gms.maps.model.Marker> markerList = floorMarkerMap.get(floorID);
    for (com.google.android.gms.maps.model.Polyline line : floorLines) {
        line.setVisible(visibility);
    }
    for (com.google.android.gms.maps.model.Marker marker : markerList) {
        marker.setVisible(visibility);
    }
}
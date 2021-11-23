private com.example.bogdan.proftime_map.markers.CustomMarker findMinDistance(java.util.List<com.example.bogdan.proftime_map.markers.CustomMarker> markers) {
    boolean first = true;
    long min = 0;
    com.example.bogdan.proftime_map.markers.CustomMarker customMarker = null;
    for (com.example.bogdan.proftime_map.markers.CustomMarker marker : markers) {
        if (first) {
            min = marker.getDistance();
            customMarker = marker;
            first = false;
        }
        if (min > (marker.getDistance())) {
            min = marker.getDistance();
            customMarker = marker;
        }
    }
    return customMarker;
}
private void refreshMarkers(java.util.List<com.busao.gyn.stops.BusStop> stops) {
    clearMarkers();
    for (com.busao.gyn.stops.BusStop stop : stops) {
        createMarker(stop);
    }
}
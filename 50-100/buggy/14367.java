private synchronized void updateMapMarkers() {
    if (markerOptionsList.isEmpty())
        return ;
    
    map.clear();
    for (java.util.Map.Entry<java.lang.String, com.places.view.MarkerOptions> entry : markerOptionsList.entrySet()) {
        com.places.view.Marker marker = map.addMarker(entry.getValue());
        placeMarkers.put(entry.getKey(), marker);
    }
    markerOptionsList.clear();
}
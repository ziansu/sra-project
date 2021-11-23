public void restoreMarkers() {
    java.util.Iterator<application.GeographicPoint> it = markerMap.keySet().iterator();
    while (it.hasNext()) {
        gmapsfx.javascript.object.Marker marker = markerMap.get(it.next());
        if (marker != (startMarker)) {
            marker.setVisible(true);
        }
    } 
    selectManager.resetSelect();
}
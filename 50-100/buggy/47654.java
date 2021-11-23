private void removeAllMarker() {
    if (notNull(myLastPin))
        myLastPin.remove();
    
    if (notNull(markerList)) {
        for (com.google.android.gms.maps.model.Marker marker : markerList) {
            marker.remove();
        }
    }
    map.clear();
}
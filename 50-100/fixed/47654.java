private void removeAllMarker() {
    if (notNull(myLastPin))
        myLastPin.remove();
    
    if (notNull(markerList)) {
        for (com.google.android.gms.maps.model.Marker marker : markerList) {
            marker.remove();
        }
        markerList.clear();
    }else
        markerList = new java.util.ArrayList<>();
    
    map.clear();
}
void removeMarker(java.lang.String id) {
    com.google.android.gms.maps.model.Marker marker = mapMarkers.get(id);
    if (marker != null) {
        marker.remove();
    }
}
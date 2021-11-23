@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    int markerPosition = markers.indexOf(marker);
    selectMarker(markerPosition);
    if ((listener) != null) {
        if (isZoomed()) {
            listener.onActivityMarkerPressedAtIndex(markerPosition);
        }else {
            listener.onLegMarkerPressedAtIndex(markerPosition);
        }
    }
    return true;
}
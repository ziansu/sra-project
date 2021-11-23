public void removeElement(edu.istic.tdf.dfclient.domain.element.IElement element) {
    com.google.android.gms.maps.model.Marker marker = getMarker(element);
    if (marker != null) {
        marker.remove();
        markersList.remove(marker);
    }
}
@java.lang.Override
public void mouseClicked() {
    de.fhpotsdam.unfolding.marker.Marker marker = findMarker();
    if ((marker != null) && ((lastClicked) == null)) {
        lastClicked = ((module5.CommonMarker) (marker));
        hideMarkers(marker);
    }else
        lastClicked = null;
    
    unhideMarkers();
}
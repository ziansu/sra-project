@java.lang.Override
public void mouseClicked() {
    if ((lastClicked) != null) {
        unhideMarkers();
        lastClicked = null;
    }else
        if ((lastClicked) == null) {
            de.fhpotsdam.unfolding.marker.Marker marker = findMarker();
            if (marker != null) {
                lastClicked = ((module5.CommonMarker) (marker));
                hideMarkers(marker);
            }else {
                unhideMarkers();
                lastClicked = null;
            }
        }
    
}
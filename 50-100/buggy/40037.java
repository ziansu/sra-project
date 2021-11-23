private void selectMarkerIfHover(java.util.List<de.fhpotsdam.unfolding.marker.Marker> markers) {
    for (de.fhpotsdam.unfolding.marker.Marker marker : markers) {
        if ((marker.isInside(map, mouseX, mouseY)) && ((lastSelected) == null)) {
            lastSelected.setClicked(true);
            lastSelected = ((module5.CommonMarker) (marker));
            marker.setSelected(true);
            break;
        }
    }
}
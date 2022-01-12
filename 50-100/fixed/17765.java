private void selectMarkerIfHover(java.util.List<de.fhpotsdam.unfolding.marker.Marker> markers) {
    for (int i = 0; i < (markers.size()); i++) {
        de.fhpotsdam.unfolding.marker.Marker current = markers.get(i);
        if ((current.isInside(map, mouseX, mouseY)) && ((lastSelected) == null)) {
            lastSelected = ((module5.CommonMarker) (current));
            lastSelected.setSelected(true);
        }
    }
}
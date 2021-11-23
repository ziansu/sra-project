private void selectMarkerIfHover(java.util.List<de.fhpotsdam.unfolding.marker.Marker> markers) {
    for (de.fhpotsdam.unfolding.marker.Marker marker : markers) {
        de.fhpotsdam.unfolding.geo.Location markerLocation = marker.getLocation();
        if (marker.isInside(map, mouseX, mouseY)) {
            lastSelected = ((module5.CommonMarker) (marker));
            marker.setSelected(true);
        }
    }
}
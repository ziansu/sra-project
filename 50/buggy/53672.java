private void addMarkerView(io.mapsquare.osmcontributor.ui.utils.views.map.marker.LocationMarkerOptions markerOptions) {
    mapboxMap.getMarkerViewManager().removeMarkerView(markerOptions.getMarker());
    mapboxMap.removeMarker(markerOptions.getMarker());
    mapboxMap.addMarker(markerOptions);
}
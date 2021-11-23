private void drawMarker(org.osmdroid.util.GeoPoint geoPoint) {
    if ((locationMarker) == null)
        locationMarker = new org.osmdroid.views.overlay.Marker(mapView);
    
    locationMarker.setPosition(geoPoint);
    locationMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
    mapView.getOverlays().add(locationMarker);
    locationMarker.setTitle(context.getString(R.string.set_location));
    mapView.invalidate();
}
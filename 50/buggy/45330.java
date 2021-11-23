public org.osmdroid.views.overlay.OverlayItem putMarkerAt(org.osmdroid.util.GeoPoint p, android.graphics.drawable.Drawable markerDrawable) {
    org.osmdroid.views.overlay.OverlayItem markerItem = makeMarker(p, markerDrawable);
    markersOverlay.addItem(markerItem);
    map.invalidate();
    return markerItem;
}
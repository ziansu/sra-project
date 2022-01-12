private org.osmdroid.bonuspack.clustering.RadiusMarkerClusterer createPointOfInterestOverlay(java.util.List<org.osmdroid.views.overlay.Overlay> overlays) {
    org.osmdroid.bonuspack.clustering.RadiusMarkerClusterer poiMarkers = new de.k3b.android.locationMapViewer.RadiusMarkerClustererWithInfo(this);
    android.graphics.drawable.Drawable clusterIconD = getResources().getDrawable(R.drawable.marker_red_empty);
    poiMarkers.setIcon(((android.graphics.drawable.BitmapDrawable) (clusterIconD)).getBitmap());
    poiMarkers.getTextPaint().setTextSize(12.0F);
    poiMarkers.mAnchorV = org.osmdroid.bonuspack.overlays.Marker.ANCHOR_BOTTOM;
    poiMarkers.mTextAnchorU = 0.7F;
    poiMarkers.mTextAnchorV = 0.27F;
    if (overlays != null) {
        overlays.add(poiMarkers);
    }
    return poiMarkers;
}
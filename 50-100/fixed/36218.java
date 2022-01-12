public void applyNewMarkerPosition() {
    if (!(mInChangeMarkerPositionMode)) {
        throw new java.lang.IllegalStateException("Not in change marker position mode");
    }
    net.osmand.data.RotatedTileBox tileBox = activity.getMapView().getCurrentRotatedTileBox();
    mInChangeMarkerPositionMode = false;
    int newMarkerX = tileBox.getCenterPixelX();
    int newMarkerY = tileBox.getCenterPixelY();
    android.graphics.PointF newMarkerPosition = new android.graphics.PointF(newMarkerX, newMarkerY);
    showContextMenu(newMarkerPosition, tileBox, true);
    view.refreshMap();
}
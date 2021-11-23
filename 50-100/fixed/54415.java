public void applyNewMarkerPosition() {
    if (!(mInChangeMarkerPositionMode)) {
        throw new java.lang.IllegalStateException("Not in change marker position mode");
    }
    mInChangeMarkerPositionMode = false;
    net.osmand.data.RotatedTileBox tileBox = activity.getMapView().getCurrentRotatedTileBox();
    int newMarkerX = tileBox.getCenterPixelX();
    int newMarkerY = tileBox.getCenterPixelY();
    android.graphics.PointF newMarkerPosition = new android.graphics.PointF(newMarkerX, newMarkerY);
    showContextMenu(newMarkerPosition, tileBox, true);
    view.refreshMap();
}
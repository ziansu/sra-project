public void zoom(final boolean zoomIn) {
    if (zoomIn) {
        viewBox.zoomIn();
    }else {
        viewBox.zoomOut();
    }
    isInEditZoomRange();
    de.blau.android.resources.Profile.updateStrokes(strokeWidth(viewBox.getWidth()));
    if (rotatingWay) {
        showCrosshairsForCentroid();
    }
    map.postInvalidate();
}
public void zoom(final float zoomFactor) {
    try {
        viewBox.zoom(zoomFactor);
    } catch (de.blau.android.exception.OsmException e) {
        e.printStackTrace();
    }
    de.blau.android.resources.Profile.updateStrokes(strokeWidth(viewBox.getWidth()));
    if (rotatingWay) {
        showCrosshairsForCentroid();
    }
    map.postInvalidate();
}
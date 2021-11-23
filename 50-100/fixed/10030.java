private boolean privatePerformZoom(boolean byGesture, float scale, int centerX, int centerY, boolean shouldCallback) {
    float realScale = checkRealScale(scale);
    if (realScale == 1.0F) {
        fitTranslate();
        mZoomListener.onZoomEnd(byGesture, 1, centerX, centerY);
        return false;
    }
    zoomAnimated(byGesture, realScale, centerX, centerY, shouldCallback);
    return true;
}
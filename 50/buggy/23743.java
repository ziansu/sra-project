public boolean performZoom(float scale, int centerX, int centerY) {
    if ((mZoomListener) != null) {
        mZoomListener.onZoomStart(false);
    }
    return privatePerformZoom(false, scale, centerX, centerY, true);
}
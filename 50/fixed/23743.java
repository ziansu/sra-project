public boolean performZoom(float scale, int centerX, int centerY) {
    mZoomListener.onZoomStart(false);
    return privatePerformZoom(false, scale, centerX, centerY, true);
}
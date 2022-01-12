public void zoomIn(java.awt.Rectangle visible, int x, int y) {
    if ((zoomFactor) < 32) {
        visible.x = (2 * x) - (x - (visible.x));
        visible.y = (2 * y) - (y - (visible.y));
        zoomFactor *= 2;
        refresh();
        scrollRectToVisible(visible);
    }
}
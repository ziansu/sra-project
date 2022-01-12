public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    getMapPanel().zoomImage(((e.getScrollAmount()) * (e.getWheelRotation())));
}
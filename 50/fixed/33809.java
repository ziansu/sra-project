@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    camera.recordPress(new MapBuilder.Views.Utility.PixelPoint(e.getX(), e.getY()));
    cursorState.setMarkerActive(false);
}
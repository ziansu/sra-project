@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    super.mousePressed(e);
    if (state.equals(InstrumentState.RECTANGLE)) {
        lockZoomAndPan();
        rectangle.setStartPoint(e.getX(), e.getY());
        isDrawing = true;
    }
    if (state.equals(InstrumentState.ZOOM_AND_PAN)) {
        unlockZoomAndPan();
    }
}
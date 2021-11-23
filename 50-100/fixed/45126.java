@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    if (state.equals(InstrumentState.RECTANGLE)) {
        super.mousePressed(e);
        lockZoomAndPan();
        rectangle.setStartPoint(e.getX(), e.getY());
        isDrawing = true;
    }
    if (state.equals(InstrumentState.ZOOM_AND_PAN)) {
        unlockZoomAndPan();
        super.mousePressed(e);
    }
}
@java.lang.Override
public void mouseDown(org.eclipse.swt.events.MouseEvent e) {
    draggableRectangle.x = (seekPoint) - 5;
    draggableRectangle.height = tmpArea.height;
    if (draggableRectangle.contains(new org.eclipse.swt.graphics.Point(e.x, e.y))) {
        if ((waveform) != null) {
            waveform.pause();
            isDragging = true;
        }
    }
}
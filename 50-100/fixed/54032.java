@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    dragging = true;
    int center = (this.getWidth()) / 2;
    int xMouseCoord = e.getX();
    if (((prevDragXCoord) > 0) && ((prevDragXCoord) != xMouseCoord)) {
        moveEntireGraphingPanel((center + ((prevDragXCoord) - xMouseCoord)));
    }
    prevDragXCoord = xMouseCoord;
}
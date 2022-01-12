@java.lang.Override
public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    if ((e.getWheelRotation()) < 0) {
        if ((batchState.getZoomLevel()) > 0.3)
            batchState.setZoomLevel(((batchState.getZoomLevel()) - 0.05));
        
    }else {
        if ((batchState.getZoomLevel()) < 3.0)
            batchState.setZoomLevel(((batchState.getZoomLevel()) + 0.05));
        
    }
}
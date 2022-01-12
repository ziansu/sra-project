public void mouseMoved(java.awt.event.MouseEvent e) {
    x = e.getX();
    y = e.getY();
    synchronized(eventSync) {
        snapTo = !(e.isShiftDown());
        if ((event) == 0)
            event = EditorUI.RENDER;
        
    }
}
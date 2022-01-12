public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) == 2) {
        if ((e.getSource()) instanceof userinterface.graph.Graph) {
            ((userinterface.graph.Graph) (e.getSource())).restoreAutoBounds();
        }
        dragging = false;
        dragObject.setCursor(java.awt.Cursor.getDefaultCursor());
    }
}
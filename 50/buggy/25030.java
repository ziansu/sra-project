public void actionPerformed(java.awt.event.ActionEvent e) {
    dragObject = models.get(theTabs.getSelectedIndex());
    dragObject.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    getPoint();
    dragging = true;
    doDrag();
}
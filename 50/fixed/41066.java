public void mousePressed(java.awt.event.MouseEvent e) {
    mousePt = e.getPoint();
    if (e.isPopupTrigger()) {
        popUpTriggered(e);
    }
}
public void mousePressed(java.awt.event.MouseEvent e) {
    mousePt = e.getPoint();
    java.lang.System.out.println("mousePressed");
    if (e.isPopupTrigger()) {
        popUpTriggered(e);
    }
}
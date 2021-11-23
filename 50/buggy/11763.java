public void mouseClicked(java.awt.event.MouseEvent arg0) {
    DBRF.FestivalObject.setWindowPosition(getX(), getY());
    new DBRF.UserLogin().setVisible(true);
    dispose();
}
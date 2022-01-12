public void refresh() {
    if (!(this.isVisible())) {
        this.setVisible(true);
    }
    frames.HomePanel np = new frames.HomePanel();
    java.awt.Point point = this.getLocationOnScreen();
    np.setLocation(((int) (point.getX())), ((int) (point.getY())));
    np.setVisible(true);
    this.setVisible(false);
    this.dispose();
}
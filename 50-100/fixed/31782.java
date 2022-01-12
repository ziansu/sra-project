public java.awt.Point getRelativeMousePosition() {
    int x = (java.awt.MouseInfo.getPointerInfo().getLocation().x) - (this.getX());
    int y = (java.awt.MouseInfo.getPointerInfo().getLocation().y) - (this.getY());
    return new java.awt.Point(x, y);
}
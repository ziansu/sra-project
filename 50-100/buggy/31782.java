public java.awt.Point getRelativeMousePosition() {
    int x = (this.getX()) - (java.awt.MouseInfo.getPointerInfo().getLocation().x);
    int y = (this.getY()) - (java.awt.MouseInfo.getPointerInfo().getLocation().y);
    return new java.awt.Point(x, y);
}
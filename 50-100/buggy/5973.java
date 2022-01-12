public void translate(org.jbox2d.common.Vec2 force, int milliseconds) {
    int newX = ((int) ((this.shape.getX()) + ((force.x) * milliseconds)));
    int newY = ((int) ((this.shape.getY()) + ((force.y) * milliseconds)));
    this.shape.setLocation(newX, newY);
}
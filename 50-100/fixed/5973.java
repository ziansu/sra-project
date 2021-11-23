public void translate(org.jbox2d.common.Vec2 force, int milliseconds) {
    int newX = ((int) (java.lang.Math.round(((this.shape.getX()) + ((force.x) * milliseconds)))));
    int newY = ((int) (java.lang.Math.round(((this.shape.getY()) + ((force.y) * milliseconds)))));
    this.shape.setLocation(newX, newY);
}
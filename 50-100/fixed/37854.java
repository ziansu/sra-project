public double getAngle(int index) {
    java.awt.geom.Point2D p1 = this.getPosition(index);
    java.awt.geom.Point2D p2 = this.getPosition((index + 1));
    return java.lang.Math.atan2(((p2.getY()) - (p1.getY())), ((p2.getX()) - (p1.getX())));
}
public void turnToAngle(org.dyn4j.geometry.Vector2 p) {
    double degree = (java.lang.Math.atan2((-((this.getWorldCenter().y) - (p.y))), ((this.getWorldCenter().x) - (p.x)))) - ((java.lang.Math.PI) / 2);
    this.rotate(((this.angle) - degree), this.getWorldCenter());
    this.angle = degree;
    this.direction = p;
}
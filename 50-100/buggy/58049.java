public void turnToAngle(org.dyn4j.geometry.Vector2 direction) {
    double degree = (java.lang.Math.atan2((-((this.getWorldCenter().x) - (direction.y))), ((this.getWorldCenter().y) - (direction.x)))) - ((java.lang.Math.PI) / 2);
    this.rotate(((this.angle) - degree), this.getWorldCenter());
    this.angle = degree;
    this.direction = direction;
}
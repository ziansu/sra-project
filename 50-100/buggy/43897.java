private void update(double distance) {
    this.endX = (distance * (java.lang.Math.cos(this.angle.getRadians()))) + (this.startX);
    this.endY = (distance * (java.lang.Math.sin(this.angle.getRadians()))) + (this.startY);
}
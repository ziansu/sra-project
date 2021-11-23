private void update(double distance) {
    this.endX = (this.startX) - (distance * (java.lang.Math.cos(this.angle.getRadians())));
    this.endY = (this.startY) + (distance * (java.lang.Math.sin(this.angle.getRadians())));
}
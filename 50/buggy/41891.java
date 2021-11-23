public void moveAt(double ang) {
    this.x += (java.lang.Math.cos(ang)) * (speed);
    this.y += (java.lang.Math.sin(ang)) * (speed);
    lastDirection = gametools.Sprite.DR_UNDEFINED;
}
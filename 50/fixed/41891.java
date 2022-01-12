public void moveAt(double ang) {
    x += (java.lang.Math.cos(ang)) * (speed);
    y += (java.lang.Math.sin(ang)) * (speed);
    lastDirection = gametools.Sprite.DR_UNDEFINED;
}
public void updateAngle(float radAngleToNorth) {
    angleToRotate = ((int) ((radAngleToNorth * 180) / (java.lang.Math.PI)));
    invalidate();
}
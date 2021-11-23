private float toDrawingAngle(double angleInRadians) {
    double fixedAngle = java.lang.Math.toDegrees(angleInRadians);
    if (angleInRadians > 0)
        fixedAngle = 360 - fixedAngle;
    else
        fixedAngle = -fixedAngle;
    
    return ((float) (fixedAngle));
}
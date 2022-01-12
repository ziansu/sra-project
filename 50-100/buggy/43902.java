public double getAngle() {
    angles = adafruit.getAngularOrientation().toAxesReference(AxesReference.INTRINSIC).toAxesOrder(AxesOrder.ZYX);
    double angle = AngleUnit.DEGREES.normalize(AngleUnit.DEGREES.fromUnit(angles.angleUnit, angles.firstAngle));
    angle = -angle;
    if (angle < 0) {
        angle += 360;
    }
    return angle;
}
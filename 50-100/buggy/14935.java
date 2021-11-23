public double convertDistanceToTargetAngle(double distance) {
    double v0 = convertDistanceToTargetVelocity(distance);
    return java.lang.Math.asin((v0 / ((cos(targetAngle)) * (java.lang.Math.sqrt(((v0 * v0) - ((2 * (gravity)) * (height))))))));
}
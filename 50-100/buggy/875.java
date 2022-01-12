public double convertDistanceToTargetVelocity(double distance) {
    return java.lang.Math.sqrt((((2 * (gravity)) * (height)) + ((((gravity) * distance) * distance) / (((2 * (cos(targetAngle))) * (cos(targetAngle))) * ((height) + (distance * (java.lang.Math.tan(targetAngle))))))));
}
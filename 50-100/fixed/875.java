public double convertDistanceToTargetVelocity(double distance) {
    return java.lang.Math.sqrt((((2 * (gravity)) * (height)) + ((((gravity) * distance) * distance) / (((2 * (java.lang.Math.cos(targetAngle))) * (java.lang.Math.cos(targetAngle))) * ((height) + (distance * (java.lang.Math.tan(targetAngle))))))));
}
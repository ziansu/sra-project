public double turnAuto(double deg) {
    double x = java.lang.Math.round(RobotMap.sensorsgyro.getAngle());
    error = (deg / x) / deg;
    return error;
}
private static double gallonPerMileForLightVeh(double speed) {
    double y = 0;
    if (speed < 50) {
        y = java.lang.Math.pow((0.3197 * speed), (-0.615));
    }else {
        y = java.lang.Math.pow((0.009 * speed), 0.3337);
    }
    return y;
}
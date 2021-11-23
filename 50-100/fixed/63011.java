public static double gallonPerMileForLightVeh(double speed) {
    double y = 0;
    if (speed < 50) {
        y = 0.3197 * (java.lang.Math.pow(speed, (-0.615)));
    }else {
        y = 0.009 * (java.lang.Math.pow(speed, 0.3337));
    }
    return y;
}
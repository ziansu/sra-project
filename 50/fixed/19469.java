public static double gallonPerMileForTruckVeh(double speed) {
    double y = 0;
    y = 1.0662 * (java.lang.Math.pow(speed, (-0.483)));
    return y;
}
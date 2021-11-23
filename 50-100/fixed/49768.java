public static double getAngleDegrees(double x, double y, double xT, double yT) {
    double result = (java.lang.Math.toDegrees(java.lang.Math.atan2((-(xT - x)), (-(yT - y))))) + 90;
    if (result < 0) {
        result += 360;
    }
    return result;
}
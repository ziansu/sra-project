public static double safeSubtract(double d1, double d2) {
    d2 = -d2;
    return com.asher_stern.crf.utilities.DoubleUtilities.safeAdd(d1, d2);
}
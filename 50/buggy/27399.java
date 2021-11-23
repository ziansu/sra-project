private static boolean isValidDouble(double d) {
    return ((!(java.lang.Double.isNaN(d))) && (!(java.lang.Double.isInfinite(d)))) && (!(java.lang.Double.isFinite(d)));
}
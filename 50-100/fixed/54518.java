public static boolean isBetween(double a, double b, double c) {
    boolean result = (b >= a) ? (c >= a) && (c <= b) : (c >= b) && (c <= a);
    return result;
}
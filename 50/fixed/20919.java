public static final double abs(double a) {
    return java.lang.Double.longBitsToDouble((((java.lang.Double.doubleToRawLongBits(a)) << 1) >>> 1));
}
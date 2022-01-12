public static java.lang.Object Minus(java.lang.Object x) {
    if (x instanceof java.lang.Double) {
        return -(((java.lang.Double) (x)).doubleValue());
    }
    return -(((java.lang.Number) (x)).longValue());
}
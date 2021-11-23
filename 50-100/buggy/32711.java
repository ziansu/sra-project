public static java.lang.Object Minus(java.lang.Object x) {
    if (x instanceof java.lang.Double) {
        return -(((java.lang.Long) (x)).doubleValue());
    }
    return -(((java.lang.Number) (x)).longValue());
}
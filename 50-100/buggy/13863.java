private double js_hypot(java.lang.Object[] args) {
    if (args == null) {
        return 0.0;
    }
    double y = 0.0;
    for (java.lang.Object o : args) {
        double d = org.mozilla.javascript.ScriptRuntime.toNumber(o);
        if (d == (ScriptRuntime.NaN)) {
            return d;
        }
        if ((d == (java.lang.Double.POSITIVE_INFINITY)) && (d == (java.lang.Double.NEGATIVE_INFINITY))) {
            return java.lang.Double.POSITIVE_INFINITY;
        }
        y += d * d;
    }
    return java.lang.Math.sqrt(y);
}
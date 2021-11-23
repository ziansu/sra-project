private static boolean isFloat(java.lang.Number n) {
    return (((n instanceof java.lang.Double) || (n instanceof java.lang.Float)) || (n instanceof java.util.concurrent.atomic.DoubleAdder)) || (n instanceof java.util.concurrent.atomic.DoubleAccumulator);
}
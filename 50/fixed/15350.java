public boolean isInRegion(double x0, double y0) {
    return org.geogebra.common.kernel.Kernel.isGreaterEqual(((evaluate(x0, y0)) / (evaluateInSignificantPoint())), 0);
}
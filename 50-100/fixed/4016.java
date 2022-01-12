private static double[] getCoords(org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction curve, double[] index) {
    final double[] coords = new double[((int) (java.lang.Math.round(index[((index.length) - 1)])))];
    for (int i = 0; i < (coords.length); i++) {
        coords[i] = curve.value(i);
    }
    return coords;
}
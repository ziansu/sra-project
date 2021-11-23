private static double[] getCoords(org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction curve, float stepSize) {
    final double[] coords = new double[((int) ((curve.getN()) / stepSize))];
    for (int i = 0; i < ((curve.getN()) / stepSize); i++) {
        coords[i] = curve.value((i * stepSize));
    }
    return coords;
}
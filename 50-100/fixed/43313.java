@java.lang.Override
public double f(double[] coeffs) {
    double[] gen = new double[xp.length];
    double[] gradient = new double[coeffs.length];
    double[] diffY = new double[xp.length];
    double sumDiff = calcGradient(coeffs, gen, gradient, diffY);
    return sumDiff;
}
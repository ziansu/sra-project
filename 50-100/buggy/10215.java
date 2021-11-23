@java.lang.Override
public double f(double[] coeffs) {
    java.lang.System.out.println("aa0");
    double[] gen = new double[xp.length];
    double[] gradient = new double[coeffs.length];
    double[] diffY = new double[xp.length];
    double sumDiff = calcGradient(coeffs, gen, gradient, diffY);
    java.lang.System.out.println(("poly coeffs=" + (java.util.Arrays.toString(coeffs))));
    java.lang.System.out.println(("  diff=" + sumDiff));
    return sumDiff;
}
public static double sumSigma(int i, double[] p, double[] q, double[] b) {
    double res = 0;
    for (int l = 0; l < (p.length); l++) {
        double power = ((p[i]) * (q[l])) + (b[l]);
        res += java.lang.Math.exp(power);
    }
    return res;
}
static double[] diff(double[] c) {
    double[] d = new double[(c.length) - 1];
    for (int i = 0; i < (d.length); i++) {
        d[i] = c[i];
    }
    return d;
}
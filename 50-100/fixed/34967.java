public double[] primalSol() {
    double[] a = new double[v];
    for (int i = 0; i < (v); i++) {
        a[((int) (t[(1 + i)][0]))] = t[(i + 1)][((1 + (con)) + (v))];
    }
    return a;
}
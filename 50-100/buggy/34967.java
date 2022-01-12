public double[] primalSol() {
    double[] a = new double[v];
    for (int i = 0; i < (con); i++) {
        if ((basis[i]) < (v)) {
            a[basis[i]] = t[i][((1 + (con)) + (v))];
        }
    }
    return a;
}
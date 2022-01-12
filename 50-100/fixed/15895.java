public double[][] getR() {
    double[][] R = new double[n][n];
    for (int i = 0; i < (n); i++) {
        java.lang.System.arraycopy(QR[i], (i + 1), R[i], (i + 1), (((n) - i) - 1));
        R[i][i] = Rdiag[i];
    }
    return R;
}
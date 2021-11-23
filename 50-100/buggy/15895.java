public double[][] getR() {
    double[][] R = new double[m][n];
    for (int i = 0; i < (m); i++) {
        java.lang.System.arraycopy(QR[i], 0, R[i], 0, i);
        R[i][i] = Rdiag[i];
    }
    return R;
}
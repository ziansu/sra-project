public static double L_ZeroOne(int[] y, int[] ypred) {
    int[][] aligned = meka.core.Metrics.align(y, ypred);
    int[] yAligned = aligned[0];
    int[] ypredAligned = aligned[1];
    int L = yAligned.length;
    for (int j = 0; j < L; j++) {
        if ((y[j]) != (ypredAligned[j]))
            return 1.0;
        
    }
    return 0.0;
}
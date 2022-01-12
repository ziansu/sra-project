public static void applyAcCoupling(double[] timeLine) {
    if ((timeLine.length) == 0)
        return ;
    
    double sum = 0.0;
    for (double slice : timeLine) {
        sum += slice;
    }
    final double mean = sum / ((double) (timeLine.length));
    for (int i = 0; i < (timeLine.length); i++) {
        timeLine[i] = (timeLine[i]) - mean;
    }
}
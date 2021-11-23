boolean isConverged(double[] oldVals, double[] newVals) {
    double diff = 0;
    for (int i = 0; i < (oldVals.length); i++) {
        diff += java.lang.Math.abs(((oldVals[i]) - (newVals[i])));
    }
    return diff <= (PageRank.EPSILON);
}
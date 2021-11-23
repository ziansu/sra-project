boolean isConverged(double[] oldVals, double[] newVals) {
    double diff = 0;
    for (int i = 0; i < (oldVals.length); i++) {
        java.lang.System.out.println(newVals[i]);
        java.lang.System.out.println(oldVals[i]);
        diff += java.lang.Math.abs(((oldVals[i]) - (newVals[i])));
    }
    return diff <= (PageRank.EPSILON);
}
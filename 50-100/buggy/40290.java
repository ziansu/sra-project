private double[] getCostTableSumExcluding(long excludedId) {
    double[] sum = new double[]{ weight , 0 };
    double[] s = getCostTableSum(excludedId);
    sum[0] = (s[0]) + (weight);
    sum[1] = java.lang.Math.min(s[0], ((s[1]) + (weight)));
    return sum;
}
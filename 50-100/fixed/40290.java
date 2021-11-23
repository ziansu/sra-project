private double[] getCostTableSumExcluding(long excludedId) {
    double[] sum = new double[]{ weight , 0 };
    double[] s = getCostTableSum(excludedId);
    s[1] += weight;
    sum[0] = s[1];
    sum[1] = java.lang.Math.min(s[0], s[1]);
    return sum;
}
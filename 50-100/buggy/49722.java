private double weightingReturn(double[] c) {
    double ret = 0;
    double w = 1;
    for (int i = 0; i < ((companies) - 1); ++i) {
        w -= c[i];
        ret += (annual_avg_return[i]) * (c[i]);
    }
    return ret + (w * (annual_avg_return[((companies) - 1)]));
}
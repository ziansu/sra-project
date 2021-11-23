double weightingReturn(double[] c) {
    double ret = 0;
    for (int i = 0; i < (companies); ++i) {
        ret += (annual_avg_return[i]) * (c[i]);
    }
    return ret + ((w) * (annual_avg_return[((companies) - 1)]));
}
public double stddev() {
    double u = mean();
    double ret = 0;
    for (double d : result) {
        ret += (d - u) * (d - u);
    }
    ret /= (result.length) - 1;
    return java.lang.Math.sqrt(ret);
}
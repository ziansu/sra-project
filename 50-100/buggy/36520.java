public double stddev() {
    double u = mean();
    double ret = 0;
    for (double d : result) {
        ret += java.lang.Math.pow((d - u), 2);
    }
    ret /= (result.length) - 1;
    return java.lang.Math.sqrt(ret);
}
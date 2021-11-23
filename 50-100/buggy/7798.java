public static double normalizeValue(final double input, final double avg, final double std) {
    double res = 0;
    if (std != 0) {
        res = (input - avg) / std;
    }else {
        res = 0;
    }
    return res;
}
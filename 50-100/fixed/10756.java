private synchronized double semestrialCorrection(final double param) {
    final int debeq_pr = 59;
    final int debeq_au = 244;
    final double result;
    if ((cachedDay) >= 100) {
        final double xmult = ((cachedDay) - debeq_au) / 40.0;
        result = param - ((2.0 * param) * xmult);
    }else {
        final double xmult = ((cachedDay) - debeq_pr) / 40.0;
        result = ((2.0 * param) * xmult) - param;
    }
    return result;
}
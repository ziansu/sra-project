public static final double squareDistance(final mpicbg.models.Point p1, final mpicbg.models.Point p2) {
    assert (p1.l.length) == (p2.l.length) : "Both points have to have the same number of dimensions.";
    double sum = 0.0;
    for (int i = 0; i < (p1.w.length); ++i) {
        final double d = (p1.w[i]) - (p2.w[i]);
        sum += d * d;
    }
    return sum;
}
protected double gammaRatio(double nominator, double denominator) {
    double ratio = 0;
    double gap = denominator - nominator;
    for (int i = 0; i < gap; i++) {
        ratio *= (denominator - 1) - i;
    }
    ratio = 1.0 / ratio;
    return ratio;
}
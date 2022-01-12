protected double gammaRatio(double nominator, double denominator) {
    double ratio = 1;
    double gap = denominator;
    for (int i = 0; i < gap; i++) {
        ratio *= (denominator - 1) - i;
    }
    ratio = 1.0 / ratio;
    return ratio;
}
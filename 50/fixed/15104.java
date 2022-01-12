static boolean isNegativeZero(double x) {
    return (x == 0.0) && ((1 / x) < 0);
}
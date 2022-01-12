private double myPowRecurse(double x, int n) {
    if (n == 0) {
        return 1;
    }
    if (n == 1) {
        return x;
    }
    double halfMyPow = myPowRecurse(x, (n / 2));
    if ((n % 2) == 1) {
        return (halfMyPow * halfMyPow) * x;
    }else {
        return halfMyPow * halfMyPow;
    }
}
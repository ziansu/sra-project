public static double powi(double x, int p) {
    if (p <= 2) {
        return java.lang.Math.pow(x, p);
    }
    double tmp = x;
    double ret = ((p & 1) == 1) ? x : 1.0;
    p >>= 1;
    while (true) {
        if (p == 1) {
            return ret * tmp;
        }
        if ((p & 1) != 0) {
            ret *= tmp;
        }
        tmp *= tmp;
        p >>= 1;
    } 
}
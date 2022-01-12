public double pow(double x, long n) {
    double ret;
    if (0 == n) {
        ret = 1;
    }else
        if (n < 0) {
            ret = 1.0 / (pow(x, (0 - n)));
        }else {
            double half = pow(x, (n / 2));
            ret = half * half;
            if ((n % 2) == 1) {
                ret *= x;
            }
        }
    
    return ret;
}
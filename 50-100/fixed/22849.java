public double findSqrt(double n, int precision) {
    double p = 1;
    while ((precision--) > 0)
        p /= 10;
    
    double x = n;
    double x_temp = x;
    do {
        x = x_temp;
        x_temp = (x / 2) + ((n / 2) / x);
    } while ((java.lang.Math.abs((x - x_temp))) > p );
    return x;
}
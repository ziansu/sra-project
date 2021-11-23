private static double potQuadAlgOpt(double x, int n) {
    if (n == 0)
        return x;
    
    double p = PowerBySquaringRecursive.potQuadAlgOpt(x, (n >> 1));
    if ((n & 1) == 0) {
        return p * p;
    }else {
        return (x * p) * p;
    }
}
private static double potQuadAlg(double x, int n) {
    if (n == 0)
        return 1;
    
    if ((n % 2) == 0) {
        double p = PowerBySquaringRecursive.potQuadAlg(x, (n / 2));
        return p * p;
    }else {
        double p = PowerBySquaringRecursive.potQuadAlg(x, ((n - 1) / 2));
        return (x * p) * p;
    }
}
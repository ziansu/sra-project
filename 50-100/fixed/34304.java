public static int countFactors(long n) {
    int factors = 0;
    long max = java.lang.Math.round(java.lang.Math.sqrt(n));
    for (int i = 1; i <= max; i++) {
        if ((n % i) == 0) {
            factors += 2;
        }
    }
    if (n == (max * max)) {
        factors--;
    }
    return factors;
}
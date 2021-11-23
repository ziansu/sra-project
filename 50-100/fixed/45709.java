private static boolean isPrime(final long x) {
    if (x <= 1) {
        return false;
    }
    for (long i = 2; i <= (java.lang.Math.sqrt(x)); i++) {
        if ((x % i) == 0) {
            return false;
        }
    }
    return true;
}
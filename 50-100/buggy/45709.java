private static boolean isPrime(final long x) {
    for (long i = 2; i <= (java.lang.Math.sqrt(x)); i++) {
        if ((x % i) == 0) {
            return false;
        }
    }
    return true;
}
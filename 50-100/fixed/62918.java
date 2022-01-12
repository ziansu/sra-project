public static boolean isPrime(long n) {
    for (long i = n - 1; i > 1; i--) {
        if ((n % i) == 0) {
            return false;
        }
    }
    if ((n == 0) || (n == 1)) {
        return false;
    }
    return true;
}
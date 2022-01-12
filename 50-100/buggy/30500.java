public static boolean isPrime(long n) {
    if (n > 3) {
        if ((n % 2) == 0) {
            return false;
        }
        for (long i = 3; i < ((long) (java.lang.Math.sqrt(n))); i += 2) {
            if ((n % i) == 0) {
                return false;
            }
        }
    }
    return true;
}
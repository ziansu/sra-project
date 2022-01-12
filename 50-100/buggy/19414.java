private static boolean isPrime(int n) {
    if (((n % 2) == 0) || ((n % 3) == 0)) {
        return false;
    }
    for (int i = 5; (i * i) < n; i += 2) {
        if ((n % i) == 0) {
            return false;
        }
    }
    return true;
}
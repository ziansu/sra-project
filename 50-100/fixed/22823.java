boolean isPrime(java.math.BigInteger m) {
    int n = m.intValue();
    if (n < 3) {
        return false;
    }
    for (int i = 2; i <= (java.lang.Math.sqrt(n)); i++) {
        if ((n % i) == 0) {
            return false;
        }
    }
    return true;
}
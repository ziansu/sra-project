public static boolean isPrime(long n) {
    long temp;
    boolean isPrime = true;
    for (int i = 2; (i * i) <= n; i++) {
        temp = n % i;
        if (temp == 0) {
            isPrime = false;
        }
    }
    if (n < 2) {
        isPrime = false;
    }
    return isPrime;
}
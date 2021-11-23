public static boolean isPrime(int number) {
    if (number == 1) {
        return false;
    }
    boolean isPrime = true;
    for (int i = 2; i <= (java.lang.Math.sqrt(number)); i++) {
        if ((number % i) == 0) {
            return false;
        }
    }
    return isPrime;
}
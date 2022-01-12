public static boolean isPrime(int number) {
    if (number == 1) {
        return false;
    }
    if (number == 2) {
        return true;
    }
    if ((number % 2) == 0) {
        return false;
    }
    boolean isPrime = true;
    for (int i = 2; i <= (java.lang.Math.sqrt(number)); i = i + 1) {
        if ((number % i) == 0) {
            return false;
        }
    }
    return isPrime;
}
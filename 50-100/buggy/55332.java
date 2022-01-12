public static boolean isPrime(long input) {
    if (input <= 1) {
        throw new java.lang.IllegalArgumentException("Primality can be tested only for numbers >= 2");
    }
    if ((input == 2) || (input == 3)) {
        return true;
    }
    if ((input % 2) == 0) {
        return false;
    }
    for (long i = 3; (i * i) < input; i += 2) {
        if ((input % i) == 0) {
            return false;
        }
    }
    return true;
}
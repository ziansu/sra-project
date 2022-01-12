private int checkNumberOfDivisors(final long number) {
    if (number < 1) {
        return 0;
    }
    int divisors = 2;
    long sqrt = ((long) (java.lang.Math.sqrt(number)));
    for (int i = 2; i < sqrt; i++) {
        if ((number % i) == 0) {
            divisors += 2;
        }
    }
    if ((sqrt * sqrt) == number) {
        divisors--;
    }
    return divisors;
}
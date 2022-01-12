private static java.util.List<java.lang.Long> foundDivisors(long num) {
    java.util.List<java.lang.Long> divisors = new java.util.ArrayList<>();
    long max = num / 2;
    for (long l = 1; l <= max; l++) {
        if ((num % l) == 0) {
            divisors.add(l);
        }
    }
    divisors.add(num);
    return divisors;
}
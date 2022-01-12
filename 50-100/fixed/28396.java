public static java.util.Set<java.lang.Long> factors(long n) {
    java.util.HashSet<java.lang.Long> factors = new java.util.HashSet<java.lang.Long>();
    long number = n;
    for (long i = 2; i <= number; i++) {
        if ((number % i) == 0) {
            factors.add(i);
            number /= i;
            i = 2;
        }
    }
    return factors;
}
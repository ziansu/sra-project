public static java.util.Set<java.lang.Integer> factors(long n) {
    java.util.HashSet<java.lang.Integer> factors = new java.util.HashSet<java.lang.Integer>();
    long number = n;
    for (int i = 2; i < number; i++) {
        if ((i % number) == 0) {
            factors.add(i);
            number /= i;
            i--;
        }
    }
    return factors;
}
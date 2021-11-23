private static java.util.List<java.lang.Integer> generate(int n) {
    java.util.List<java.lang.Integer> factors = new java.util.ArrayList<>();
    if (n == 1) {
        return factors;
    }
    for (int i = 2; i <= n; i++) {
        if ((n % i) == 0) {
            factors.add(i);
            n /= i;
        }
    }
    if (factors.isEmpty()) {
        factors.add(n);
    }
    return factors;
}
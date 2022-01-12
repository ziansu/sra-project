private java.util.List<java.lang.Integer> factorization(java.lang.Integer number) {
    int n = number;
    java.util.List<java.lang.Integer> factors = new java.util.ArrayList<java.lang.Integer>();
    factors.add(1);
    for (int i = 2; i <= n; i++) {
        while ((n % i) == 0) {
            if (!(factors.contains(i)))
                factors.add(i);
            
            n /= i;
        } 
    }
    return factors;
}
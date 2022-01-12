private java.util.Set<java.util.List<java.lang.Integer>> getUniqueFactorization(int n) {
    java.util.Set<java.util.List<java.lang.Integer>> uniqueFactorizations = uniqueFactorizationCache.get(n);
    if (uniqueFactorizations == null) {
        java.util.List<java.lang.Integer> properFactors = properFactors(n);
        uniqueFactorizations = new java.util.HashSet<>();
        populateUniqueFactorizations(properFactors, uniqueFactorizations);
        uniqueFactorizationCache.put(n, uniqueFactorizations);
    }
    return uniqueFactorizations;
}
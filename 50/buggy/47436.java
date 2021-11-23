public static int nfactorial(int n) {
    if (n == 1)
        return n;
    
    return n * (Algorithms.algo.nfactorial((n - 1)));
}
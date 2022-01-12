public static int nfactorial(int n) {
    if (n < 0)
        return -1;
    
    if (n == 1)
        return n;
    
    return n * (Algorithms.algo.nfactorial((n - 1)));
}
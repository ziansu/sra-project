private static boolean isPrime(int N) {
    for (int i = 2; i < (java.lang.Math.sqrt(N)); ++i)
        if ((N % i) == 0)
            return false;
        
    
    return true;
}
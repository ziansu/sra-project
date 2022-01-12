public static boolean trialDivisionImp(long n) {
    if (n == 1)
        return false;
    
    int sqrtN = ((int) (java.lang.Math.sqrt(n)));
    for (int i = 2; i <= sqrtN; i++) {
        if ((n % i) == 0)
            return false;
        
    }
    return true;
}
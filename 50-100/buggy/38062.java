public static boolean isPerfect(int n) {
    int remainder = java.lang.Math.abs(n);
    if (n == 0)
        return false;
    
    for (int i = 1; i < n; i++) {
        if ((n % i) == 0)
            remainder -= i;
        
    }
    if (remainder == 0)
        return true;
    else
        return false;
    
}
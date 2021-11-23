public static boolean isPerfect(int n) {
    int remainder = n;
    for (int i = 0; i < n; i++) {
        if ((n % i) == 0)
            remainder -= i;
        
    }
    if (remainder == 0)
        return true;
    else
        return false;
    
}
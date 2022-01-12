public static int gcd(int x, int y) {
    int num = 0;
    if ((x <= 0) || (y <= 0))
        return -1;
    
    for (int i = 1; i <= x; i++) {
        if (((x % i) == 0) && ((y % i) == 0))
            num = i;
        
    }
    return num;
}
public static int gcd(int x, int y) {
    int num = 0;
    for (int i = 0; i < x; i++) {
        if (((x % i) == 0) && ((y % i) == 0))
            num = i;
        
    }
    return num;
}
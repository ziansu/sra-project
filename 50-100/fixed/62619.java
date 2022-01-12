public static int hammingDistance1(int x, int y) {
    int dist = 0;
    while ((x > 0) || (y > 0)) {
        if ((x % 2) != (y % 2))
            dist++;
        
        x = x >> 1;
        y = y >> 1;
    } 
    return dist;
}
public int mySqrt(int x) {
    int i = 0;
    int j = x;
    while (i < j) {
        int m = i + ((j - i) / 2);
        if ((y) == (x / m)) {
            return m;
        }else
            if ((y) > x) {
                j = m - 1;
            }else {
                i = m + 1;
            }
        
    } 
    return i;
}
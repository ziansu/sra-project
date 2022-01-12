public int mySqrt(int x) {
    if (x == 0) {
        return 0;
    }
    int i = 1;
    int j = x;
    while (i < j) {
        int m = i + ((j - i) / 2);
        if (m >= (x / m)) {
            j = m;
        }else {
            i = m + 1;
        }
    } 
    return i == (x / i) ? i : i - 1;
}
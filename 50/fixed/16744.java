public int rangeBitwiseAnd(int m, int n) {
    int step = 0;
    while (m != n) {
        m >>= 1;
        n >>= 1;
        step++;
    } 
    return m << step;
}
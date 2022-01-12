static int marbles(int n, int[] m) {
    int i = 1;
    if ((m[(i - 1)]) >= n) {
        return n;
    }else
        if (n == 0) {
            return 0;
        }else {
            i++;
        }
    
    return n - (m[(i - 1)]);
}
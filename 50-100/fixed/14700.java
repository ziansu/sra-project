static int marbles(int n, int[] m) {
    int i = 0;
    if ((m[i]) >= n) {
        return n;
    }else
        if (n == 0) {
            return 0;
        }else {
            i++;
        }
    
    return n - (m[i]);
}
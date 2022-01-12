private int f1(int n, int m, int k) {
    if ((n - 2) >= ((2 * k) + 1)) {
        if (m > k) {
            return (m / k) + ((m % k) == 0 ? 0 : 1);
        }
    }
    return INF;
}
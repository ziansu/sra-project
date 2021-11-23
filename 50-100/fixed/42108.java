static int rcc(int N, int[] s, int index) {
    if (N == 0)
        return 1;
    
    int num = 0;
    for (int j = index; j < (s.length); j++) {
        if ((s[j]) <= N) {
            num += dp.CoinChange.rcc((N - (s[j])), s, j);
        }
    }
    return num;
}
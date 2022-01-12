static int rcc(int N, int[] s, int index) {
    if (N == 0)
        return 1;
    
    int num = 0;
    for (int i = index; i < (s.length); i++) {
        if ((s[i]) <= N) {
            num += dp.CoinChange.rcc((N - (s[i])), s, i);
        }
    }
    return num;
}
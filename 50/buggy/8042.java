public long uniquePathsTD(int m, int n) {
    final long[][] memo = new long[m + 1][n + 1];
    return paths(0, 0, m, n, memo);
}
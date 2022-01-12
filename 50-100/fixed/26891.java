public int solution(int[] A, int N) {
    int min = java.lang.Integer.MAX_VALUE;
    for (int i = 0; i < (N - 1); i++) {
        int diff = getAbsoluteDiff(sumArr(A, 0, i), sumArr(A, (i + 1), (N - 1)));
        min = (min > diff) ? diff : min;
    }
    return min;
}
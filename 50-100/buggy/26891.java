public static int solution(int[] A, int N) {
    int min = java.lang.Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
        int diff = zhangxu.onlinetest.cod.lessons.timecmplx.TapeEquilibrium.getAbsoluteDiff(zhangxu.onlinetest.cod.lessons.timecmplx.TapeEquilibrium.sumArr(A, 0, i), zhangxu.onlinetest.cod.lessons.timecmplx.TapeEquilibrium.sumArr(A, (i + 1), (N - 1)));
        min = (min > diff) ? diff : min;
    }
    return min;
}
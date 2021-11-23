private void updateParents(int N, int[][] M) {
    for (int r = 0; r < N; r++) {
        for (int c = r; c < N; c++) {
            if ((M[r][c]) == 1) {
                if ((find(r)) != (find(c))) {
                    union(r, c, N);
                }
            }
        }
    }
}
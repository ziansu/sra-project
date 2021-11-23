public static int findMax(int[][] a) {
    int max = java.lang.Integer.MIN_VALUE;
    for (int i = 0; i < (a.length); i++) {
        for (int j = 0; j < (a.length); j++) {
            if ((a[i][j]) > max) {
                max = a[i][j];
            }
        }
    }
    return max;
}
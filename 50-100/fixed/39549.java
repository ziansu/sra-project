public static int findMin(int[][] a) {
    int min = java.lang.Integer.MAX_VALUE;
    for (int i = 0; i < (a.length); i++) {
        for (int j = 0; j < (a[i].length); j++) {
            if ((a[i][j]) < min) {
                min = a[i][j];
            }
        }
    }
    return min;
}
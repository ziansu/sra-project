public static float findMin(float[][] a) {
    float min = java.lang.Float.POSITIVE_INFINITY;
    for (int i = 0; i < (a.length); i++) {
        for (int j = 0; j < (a.length); j++) {
            if ((a[i][j]) < min) {
                min = a[i][j];
            }
        }
    }
    return min;
}
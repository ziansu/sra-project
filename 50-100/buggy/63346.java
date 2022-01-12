public static float findMax(float[][] a) {
    float max = java.lang.Float.NEGATIVE_INFINITY;
    for (int i = 0; i < (a.length); i++) {
        for (int j = 0; j < (a.length); j++) {
            if ((a[i][j]) > max) {
                max = a[i][j];
            }
        }
    }
    return max;
}
public static boolean intersects(float[] r1, float[] r2) {
    int d = (r1.length) / 2;
    for (int i = 0; i < d; i++) {
        int j = i + d;
        if (((r1[i]) > (r2[j])) || ((r1[j]) < (r2[i]))) {
            return false;
        }
    }
    return true;
}
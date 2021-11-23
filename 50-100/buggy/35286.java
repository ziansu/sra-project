public static boolean intersects(double[] r1, double[] r2) {
    int d = (r1.length) / 2;
    for (int i = 0; i < d; i++) {
        int j = i + d;
        if (((r1[i]) > (r2[i])) || ((r1[j]) < (r2[j]))) {
            return false;
        }
    }
    return true;
}
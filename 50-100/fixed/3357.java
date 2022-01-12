public static void minArray(double[] from1, double[] from2, double[] to) {
    for (int i = 0; i < (from1.length); i++) {
        to[i] = java.lang.Math.min(from1[i], from2[i]);
    }
}
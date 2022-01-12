public static double norm2(float[] x) {
    double dot = 0;
    for (int i = 0; i < (x.length); ++i) {
        dot += (x[i]) * (x[i]);
    }
    return dot;
}
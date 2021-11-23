public static double norm2(double[] x, int dim) {
    double dot = 0;
    for (int i = 0; i < dim; ++i) {
        dot += (x[i]) * (x[i]);
    }
    return java.lang.Math.sqrt(dot);
}
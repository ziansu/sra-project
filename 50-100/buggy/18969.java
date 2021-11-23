public double[] truncate(double[] x, int B) {
    int[] sorted_indices = bubblesort_index(abs_vector(x));
    for (int i = 0; i < (((x.length) - B) - 1); i++) {
        x[sorted_indices[i]] = 0.0;
    }
    return x;
}
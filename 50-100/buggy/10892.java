public void colsum(int[] histogram) {
    col_idx[0] = 0;
    int index = 0;
    for (int i = 1; i <= (numCols); i++) {
        col_idx[i] = index += histogram[(i - 1)];
    }
    java.lang.System.arraycopy(col_idx, 0, histogram, 0, numCols);
    growMaxLength(nz_length, false);
    nz_length = index;
}
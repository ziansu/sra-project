private int getLargestRow(com.vafilor.neural.Matrix matrix) {
    int largest = 0;
    double largestValue = matrix.getEntry(largest, 0);
    for (int i = 0; i < (matrix.getRows()); i++) {
        if ((matrix.getEntry(i, 0)) > largestValue) {
            largest = i;
            largestValue = matrix.getEntry(largest, 0);
        }
    }
    return largest;
}
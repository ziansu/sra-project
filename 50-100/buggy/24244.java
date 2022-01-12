private int getLargestRow(com.vafilor.neural.Matrix matrix) {
    int largest = (matrix.getRows()) - 1;
    double largestValue = matrix.getEntry(largest, 0);
    for (int i = (matrix.getRows()) - 1; i >= 0; i--) {
        if ((matrix.getEntry(i, 0)) > largestValue) {
            largest = i;
            largestValue = matrix.getEntry(largest, 0);
        }
    }
    return largest;
}
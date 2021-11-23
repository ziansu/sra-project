public int getMinimumRow(int column) {
    int lowestValue = java.lang.Integer.MAX_VALUE;
    int lowestValueIndex = -1;
    for (int row = 0; row < (matrix.length); row++) {
        if (lowestValue > (matrix[row][column])) {
            lowestValue = matrix[row][column];
            lowestValueIndex = row;
        }
    }
    return lowestValueIndex;
}
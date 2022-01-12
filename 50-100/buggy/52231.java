private int countColHeight(int[][] field, int colIndex) {
    int count = 0;
    for (int rowIndex = 0; rowIndex < (field.length); rowIndex++) {
        count += field[colIndex][rowIndex];
    }
    return count;
}
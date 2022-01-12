private int countColHeight(int[][] field, int colIndex) {
    assert colIndex <= ((field[0].length) - 1);
    int count = 0;
    for (int rowIndex = 0; rowIndex < (field.length); rowIndex++) {
        count += field[rowIndex][colIndex];
    }
    return count;
}
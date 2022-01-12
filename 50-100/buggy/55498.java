public void shiftBoxesByOneRow() {
    for (int row = (com.gdimitris.boxcrush.BoxGrid.ROWS) - 2; row > 0; row--) {
        for (int col = (com.gdimitris.boxcrush.BoxGrid.COLUMNS) - 1; col > 0; col--) {
            addBoxAtPosition(boxArray[row][col], (row + 1), col);
            removeBoxAtPosition(row, col);
        }
    }
}
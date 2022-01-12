private int getNextColStartPos(boolean goingRight, int row_index, int numRows, int dancersOnRow) {
    if (row_index == (numRows - 1)) {
        java.lang.System.out.println(("Hello:" + row_index));
        return goingRight ? ((dancersPerRow[row_index]) - dancersOnRow) - 1 : dancersOnRow;
    }else {
        return goingRight ? -1 : dancersPerRow[row_index];
    }
}
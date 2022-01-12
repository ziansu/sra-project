public static boolean checkCondition(int[][] mat) {
    for (int i = 0; i < (pack.SudokuTest.size); i++) {
        if (pack.SudokuTest.hasDuplicateInCol(i, mat)) {
            return false;
        }
        if (pack.SudokuTest.hasDuplicateInRow(i, mat)) {
            return false;
        }
    }
    java.lang.System.out.println("Duplicate not found ");
    return true;
}
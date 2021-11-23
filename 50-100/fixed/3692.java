public static void displaySudoku(Cell[][] sudoku) {
    for (int x = 0; x < 9; x++) {
        for (int y = 0; y < 9; y++) {
            Dimension dime = new Dimension(x, y);
            java.lang.System.out.print(DimensionUtil.getCell(sudoku, dime).getCellValue());
        }
        java.lang.System.out.println(" ");
    }
}
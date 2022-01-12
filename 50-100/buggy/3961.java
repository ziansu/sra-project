private java.lang.String convertToR1C1(int row, boolean isRowRel, int col, boolean isColRel, org.apache.poi.ss.util.CellReference cell) {
    int cellRow = cell.getRow();
    int cellCol = cell.getCol();
    row += 1;
    col += 1;
    java.lang.String formulaCol = (isColRel) ? ("C[" + (col - cellCol)) + "]" : "C" + col;
    java.lang.String formulaRow = (isRowRel) ? ("R[" + (row - cellRow)) + "]" : "R" + row;
    return formulaRow + formulaCol;
}
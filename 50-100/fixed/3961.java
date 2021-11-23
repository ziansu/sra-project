private java.lang.String convertToR1C1(int row, boolean isRowRel, int col, boolean isColRel, org.apache.poi.ss.util.CellReference cell) {
    int cellRow = cell.getRow();
    int cellCol = cell.getCol();
    java.lang.String formulaCol = (isColRel) ? ("C[" + (col - cellCol)) + "]" : "C" + (col + 1);
    java.lang.String formulaRow = (isRowRel) ? ("R[" + (row - cellRow)) + "]" : "R" + (row + 1);
    return formulaRow + formulaCol;
}
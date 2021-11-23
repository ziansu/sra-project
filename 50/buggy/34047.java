public void setCurrentCell(com.pinguinson.sudoku.view.SudokuCell currentCell) {
    deselectCell();
    this.currentCell = currentCell;
    if (currentCell != null) {
        updateButtons();
        currentCell.setSelection(true);
    }
}
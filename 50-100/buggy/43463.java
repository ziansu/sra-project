public void enterNumber(edu.psu.sweng500.team8.coreDataStructures.CellCoordinates cellCoordinates, int number) {
    edu.psu.sweng500.team8.coreDataStructures.Cell currentCell = board.getCell(cellCoordinates.getRowIndex(), cellCoordinates.getColumnIndex());
    currentCell.setNumber(number);
    edu.psu.sweng500.team8.play.SudokuAction sudokuAction = new edu.psu.sweng500.team8.play.SudokuAction(new edu.psu.sweng500.team8.coreDataStructures.CellGrid(board.getCellGrid()));
    actionManager.addAction(sudokuAction);
}
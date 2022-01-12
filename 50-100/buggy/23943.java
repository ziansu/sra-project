public boolean initEmptyBoard() {
    builderFiles.BuilderSquare[][] squareArray = new builderFiles.BuilderSquare[6][6];
    for (int row = 0; row < 6; row++) {
        for (int col = 0; col < 6; col++) {
            squareArray[row][col] = new builderFiles.BuilderSquare(row, col);
            squareArray[row][col] = null;
        }
    }
    builderFiles.BuilderBoard newBoard = new builderFiles.BuilderBoard(squareArray);
    this.board = newBoard;
    return true;
}
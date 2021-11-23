public SudokuSquareNode getNext() {
    SudokuSquareNode aSudokuNode = squareToReturn;
    if ((squareToReturn) != null) {
        squareToReturn = squareToReturn.getNext();
    }
    return aSudokuNode;
}
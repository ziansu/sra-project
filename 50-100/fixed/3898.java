public void upArrowAndXButton() {
    if ((currPiece.checkPieceAtDropLoc()) && ((droppedCounter) == 0)) {
        droppedCounter = 1;
    }
    currPiece.turnClockwise(boardVals, 0);
    BoardCoord[] dropLoc = board.determineDropLoc(currPiece);
    currPiece.setDropLoc(dropLoc);
}
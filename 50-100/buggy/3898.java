public void upArrowAndXButton() {
    if ((currPiece.checkPieceAtDropLoc()) && ((droppedCounter) == 0)) {
        droppedCounter = 1;
    }
    java.lang.System.out.println("up");
    currPiece.turnClockwise(boardVals, 0);
    BoardCoord[] dropLoc = board.determineDropLoc(currPiece);
    currPiece.setDropLoc(dropLoc);
}
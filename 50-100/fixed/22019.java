public void dropADiscFromTop(int col, int currentplayer) {
    int firstEmptyCellRow = ((height) - (this.numOfDiscsInColumn[col])) - 1;
    Player.Printer.printToDebugFile(((("First: " + firstEmptyCellRow) + "Col: ") + col));
    board[firstEmptyCellRow][col] = currentplayer;
    (this.numOfDiscsInColumn[col])++;
    Player.Printer.printToDebugFile("Done dropping a disc.");
}
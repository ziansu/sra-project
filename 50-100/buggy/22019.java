public void dropADiscFromTop(int col, int currentplayer) {
    Player.Printer.printToDebugFile("About to be dropping a disc.");
    int firstEmptyCellRow = ((height) - (this.numOfDiscsInColumn[col])) - 1;
    Player.Printer.printToDebugFile("About to be dropping a disc.3");
    Player.Printer.printToDebugFile(((("First: " + firstEmptyCellRow) + "Col: ") + col));
    board[firstEmptyCellRow][col] = currentplayer;
    Player.Printer.printToDebugFile("About to be dropping a disc.2");
    (this.numOfDiscsInColumn[col])++;
    Player.Printer.printToDebugFile("Done dropping a disc.");
}
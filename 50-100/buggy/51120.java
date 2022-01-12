public void resetButtons() {
    for (int i = 0; i < (theBoard.boardSize); ++i) {
        for (int j = 0; j < (theBoard.boardSize); ++j) {
            java.lang.String boardValue = java.lang.Integer.toString(theBoard.getSquare(i, j).getValue());
            if (boardValue == "0") {
                boardValue = "";
            }
            sudokuButtons[i][j].setText(boardValue);
        }
    }
}
public void newGame(int _boardSize, int _difficulty) {
    boardSize = _boardSize;
    board = new me.valesken.jeff.sudoku_structure.Board(boardSize);
    difficulty = board.NewGame(_difficulty);
    loadJSON = null;
    saveFile = null;
    loadJSONPosition = -1;
}
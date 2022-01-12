public char checkSpace(int board, int space) {
    char result;
    if ((parent) == null) {
        result = base.checkSpace(boardChanged, spaceChanged);
    }else {
        result = parent.checkSpace(boardChanged, spaceChanged);
    }
    if (((result == (EngineValues.EMPTY)) && (board == (boardChanged))) && (space == (spaceChanged))) {
        result = player;
    }
    return result;
}
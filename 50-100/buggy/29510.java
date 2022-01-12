public void mark(int col, int row) {
    if (((utility) == (-1)) && ((getValue(col, row)) == (cs572_lab2.ReversiState.EMPTY))) {
        board[getAbsPosition(col, row)] = playerToMove;
        flipPieces(col, row);
        analyzeUtility();
        playerToMove = ((playerToMove) == (cs572_lab2.ReversiState.X)) ? cs572_lab2.ReversiState.O : cs572_lab2.ReversiState.X;
    }
}
public char getNextPlayer() {
    int xMoves = 0;
    int oMoves = 0;
    for (int i = 0; i < 9; i++) {
        if ((board[i]) == 'x') {
            xMoves++;
        }
        if ((board[i]) == 'o') {
            oMoves++;
        }
    }
    if (oMoves > xMoves) {
        return 'o';
    }else {
        return 'x';
    }
}
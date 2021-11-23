private boolean solveH(int col) {
    int i = 0;
    for (i = 0; i < (board.length); i++) {
        if (addQueen(i, col)) {
            if ((col > ((board[0].length) - 2)) || (solveH((col + 1)))) {
                return true;
            }else {
                removeQueen(i, col);
            }
        }
    }
    return false;
}
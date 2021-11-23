private boolean countH(int col) {
    if (col >= (board.length)) {
        solutionCount += 1;
    }
    for (int i = 0; i < (board.length); i++) {
        if ((board[i][col]) == 0) {
            addQueen(i, col);
            solveH((col + 1));
            removeQueen(i, col);
        }
    }
    return false;
}
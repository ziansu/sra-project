public void undo() {
    if (history.isEmpty()) {
        return ;
    }
    basic.Move move = history.pop();
    win = false;
    for (int z = (N) - 1; z >= 0; z--) {
        if ((board[move.s][z]) != 0) {
            board[move.s][z] = 0;
            return ;
        }
    }
}
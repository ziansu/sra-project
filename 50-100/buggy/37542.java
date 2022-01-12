public void undo() {
    if (history.isEmpty()) {
        return ;
    }
    basic.Move move = history.pop();
    win = false;
    for (int z = 1; z <= (N); z++) {
        if ((board[move.s][z]) != 0) {
            board[move.s][z] = 0;
            return ;
        }
    }
}
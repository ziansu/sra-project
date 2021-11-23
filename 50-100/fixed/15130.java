private boolean onlyMills(int player) {
    int board = this.board[player];
    for (int i = 0; i < 24; i++) {
        if ((((board >>> i) & 1) == 1) && (!(this.isMill(board, i)))) {
            return false;
        }
    }
    return (this.count[player]) > 0;
}
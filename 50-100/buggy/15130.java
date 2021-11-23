private boolean onlyMills(int player) {
    for (int i = 0; i < 24; i++) {
        if (((((this.board[player]) >> i) & 1) == 1) && (!(this.isMill(player, i)))) {
            return false;
        }
    }
    return (this.count[player]) > 0;
}
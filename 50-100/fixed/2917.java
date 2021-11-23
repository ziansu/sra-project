public int add(int col) {
    if (!(columnIsFull(col))) {
        board[getNextRow(col)][col] = this.getActivePlayer();
        if (hasLost(1)) {
            player1lost = true;
            return 1;
        }else
            if (hasLost(2)) {
                player2lost = true;
                return 1;
            }else {
                this.changeActivePlayer();
            }
        
        return 2;
    }
    return 0;
}
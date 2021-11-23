public boolean add(int col) {
    if (!(columnIsFull(col))) {
        board[getNextRow(col)][col] = this.getActivePlayer();
        if (hasLost(1)) {
            player1lost = true;
            return true;
        }else
            if (hasLost(2)) {
                player2lost = true;
                return true;
            }else {
                this.changeActivePlayer();
            }
        
        return false;
    }
    return false;
}
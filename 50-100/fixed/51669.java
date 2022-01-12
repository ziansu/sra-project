public boolean canRemoveADiscFromBottom(int col, int currentPlayer) {
    if ((col < 0) || (col >= (this.width))) {
        return false;
    }else
        if ((board[((height) - 1)][col]) != currentPlayer) {
            return false;
        }else
            return true;
        
    
}
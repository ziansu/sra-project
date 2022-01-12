public boolean isValidMove(int x, int y) {
    if (((((x <= 2) && (x >= 0)) && (y <= 2)) && (y >= 0)) && ((board[x][y]) == 0))
        return true;
    
    return false;
}
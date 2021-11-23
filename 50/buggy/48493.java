public boolean solve(int startx, int starty) {
    board[startx][starty] = 0;
    return solve(startx, starty, 1);
}
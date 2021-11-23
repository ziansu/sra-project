public void set(int i, int j, pawn.APawn x) {
    grid[i][j] = x;
    x.setPos(i, j);
}
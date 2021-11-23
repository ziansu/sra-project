public void set(int i, int j, pawn.APawn x) {
    grid[i][j] = x;
    if (x instanceof pawn.APawn) {
        x.setPos(i, j);
    }
}
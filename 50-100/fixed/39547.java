private boolean isValidPosition(int x, int y) {
    if ((((x >= 0) && (x < (grid.length))) && (y >= 0)) && (y < (grid[0].length))) {
        return true;
    }
    return false;
}
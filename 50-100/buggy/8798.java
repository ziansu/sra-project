private int columnHeight(int column) {
    int r = 0;
    for (; (r < (this.height)) && ((this.grid[column][r].isEmpty()) || (this.grid[column][r].isShape())); r++);
    return ((this.height) - r) - 1;
}
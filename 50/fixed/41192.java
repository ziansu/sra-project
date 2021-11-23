public void resetCell(int x, int y) {
    if (!(this.grid[y][x].modifiable))
        throw new java.lang.RuntimeException("Cannot reset cell; user defined");
    
    this.grid[y][x].value = 0;
}
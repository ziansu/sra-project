private boolean[][] copyCells() {
    boolean[][] copy = new boolean[height][width];
    for (int y = 0; y < (this.height); y++)
        for (int x = 0; x < (this.width); x++)
            copy[y][x] = this.cells[y][x];
        
    
    return copy;
}
private boolean[][] copyCells() {
    boolean[][] copy = new boolean[width][height];
    for (int y = 0; y < (this.height); y++)
        for (int x = 0; x < (this.width); x++)
            copy[x][y] = this.cells[x][y];
        
    
    return copy;
}
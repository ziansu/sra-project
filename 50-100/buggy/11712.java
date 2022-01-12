public int[][] getBuffer() {
    int[][] out = new int[_grid.length][_grid[0].length];
    for (int i = 0; i < (_grid.length); i++)
        for (int j = 0; j < (_grid[0].length); j++)
            out[i][j] = _buffer[i][j];
        
    
    return out;
}
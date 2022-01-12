public void update() {
    for (int i = 0; i < (_grid.length); i++)
        for (int j = 0; j < (_grid[0].length); j++)
            _grid[i][j] = _buffer[i][j];
        
    
}
public void update() {
    for (int i = 0; i < (_cols); i++)
        for (int j = 0; j < (_rows); j++)
            _grid[i][j] = _buffer[i][j];
        
    
}
public void updateGrid() {
    grid = new int[length][length];
    for (int i = 0; i < (length); i++)
        for (int j = 0; j < (length); j++)
            grid[i][j] = getValueAt(i, j);
        
    
    return ;
}
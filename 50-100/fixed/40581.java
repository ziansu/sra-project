public boolean validate() {
    boolean valid = true;
    for (int i = 0; i < (getRows()); ++i)
        for (int j = 0; j < (getColumns()); ++j)
            if ((grid[i][j]) instanceof in.co.mn.minesweeper.model.LandCell)
                if (!(grid[i][j].isVisible()))
                    valid = false;
                
            
        
    
    return valid;
}
public boolean refreshBoard(int col, char disc) {
    if ((col > ((cols) - 1)) || (col < 0))
        return false;
    else
        if (boardFull())
            return false;
        
    
    for (int i = 0; i < 6; i++)
        if ((grid[col][i]) == '_') {
            grid[col][i] = disc;
            return true;
        }
    
    return false;
}
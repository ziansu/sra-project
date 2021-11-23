public void setEndPoint(int x, int y) {
    if (!(isValidLoc(x, y)))
        return ;
    
    if (grid[x][y].isPassable)
        endPoint = new CellLoc(x, y);
    
}
private boolean validPos(int x, int y) {
    if ((((x >= 0) && (y >= 0)) && (x < 3)) && (y < 3))
        return (gridVals[x][y].type) != (view.Cell.Type.BLOCKED);
    else
        return false;
    
}
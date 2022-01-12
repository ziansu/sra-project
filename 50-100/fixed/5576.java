private boolean validPos(int x, int y) {
    if ((((x >= 0) && (y >= 0)) && (x < (gridVals.length))) && (y < (gridVals[0].length)))
        return (gridVals[x][y].type) != (view.Cell.Type.BLOCKED);
    else
        return false;
    
}
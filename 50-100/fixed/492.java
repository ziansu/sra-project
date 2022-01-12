public void setCell(int x, int y, java.lang.String cellName) {
    if (((((x < 0) || (y < 0)) || (x >= (nbHCells))) || (y >= (nbVCells))) || (cellName == null))
        return ;
    
    map.get(y).get(x).setKey(cellsTypes.get(cellName));
}
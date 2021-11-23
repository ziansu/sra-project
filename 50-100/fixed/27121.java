public void addCar(int cellID, int vehicleID) {
    java.util.HashMap<java.lang.Integer, java.lang.Integer> occCells = getOccupiedCells();
    boolean occupied = true;
    while (occupied) {
        if (((occCells.get(cellID)) == null) || ((occCells.get(cellID)) == (-1))) {
            addToOccupiedCells(cellID, vehicleID);
            occupied = false;
        }else
            cellID = (cellID + 1) % (cell_count);
        
    } 
}
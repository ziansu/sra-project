public mazeADT.List<mazeADT.Cell> getNeighbors() {
    mazeADT.List<mazeADT.Cell> neighbors = new mazeADT.LinkedList<mazeADT.Cell>();
    if ((northCell) != null) {
        neighbors.add(northCell);
    }
    if ((westCell) != null) {
        neighbors.add(westCell);
    }
    if ((southCell) != null) {
        neighbors.add(southCell);
    }
    if ((eastCell) != null) {
        neighbors.add(eastCell);
    }
    return neighbors;
}
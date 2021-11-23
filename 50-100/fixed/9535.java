public java.util.List<mazeADT.Cell> getNeighbors() {
    java.util.List<mazeADT.Cell> neighbors = new java.util.LinkedList<mazeADT.Cell>();
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
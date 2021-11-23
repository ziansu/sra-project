private boolean removeNeighbour(mff.mapGenereator.Room r) {
    if (neighbours.remove(r))
        return true;
    else
        return false;
    
}
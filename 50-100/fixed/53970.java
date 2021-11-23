public boolean cellUpdate(gol.Cell c) {
    int countAliveAdjacent = countAliveAdjacent(c);
    if (c.isAlive()) {
        if (countAliveAdjacent < 2) {
            return false;
        }
        if ((countAliveAdjacent == 2) || (countAliveAdjacent == 3)) {
            return true;
        }
        if (countAliveAdjacent > 3) {
            return false;
        }
    }else {
        if (countAliveAdjacent == 3) {
            return true;
        }
    }
    return false;
}
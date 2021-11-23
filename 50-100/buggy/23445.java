public void updateActiveCells() {
    for (main.Cell c : activeCells) {
        c.updateCell();
        processCellLifeChange(c);
    }
    for (main.Cell c : activeCells) {
        c.setNumOfAliveNeighbors(determineSingleCellNeighbors(c));
    }
    activeCells.clear();
    for (main.Cell d : aliveCells) {
        activeCells.addAll(getListOfNeighbors(d));
    }
    (frameCount)++;
}
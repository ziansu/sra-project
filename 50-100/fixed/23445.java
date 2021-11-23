public void updateActiveCells() {
    for (main.Cell c : activeCells) {
        c.setNumOfAliveNeighbors(determineSingleCellNeighbors(c));
    }
    for (main.Cell c : activeCells) {
        c.updateCell();
        processCellLifeChange(c);
    }
    activeCells.clear();
    for (main.Cell d : aliveCells) {
        activeCells.addAll(getListOfNeighbors(d));
        activeCells.add(d);
    }
    (frameCount)++;
}
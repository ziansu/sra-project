public void setWalkableCells(maze.Cell[] walkableCells) {
    int i;
    for (i = 0; i < (walkableCells.length); i++) {
        this.cells[((walkableCells[i].getX()) - 1)][((walkableCells[i].getY()) - 1)] = walkableCells[i];
    }
}
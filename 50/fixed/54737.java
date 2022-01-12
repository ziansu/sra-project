public java.lang.Object[] poll() {
    java.lang.Object[] cells = cellsQueue.poll();
    firstCells = cellsQueue.peekFirst();
    return cells;
}
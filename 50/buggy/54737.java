public java.lang.Object[] poll() {
    synchronized(lock) {
        java.lang.Object[] cells = cellsQueue.poll();
        firstCells = cellsQueue.peekFirst();
        return cells;
    }
}
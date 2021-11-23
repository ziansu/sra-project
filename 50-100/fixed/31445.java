private void moveBackAlongPath() {
    synchronized(this.currentCell) {
        this.currentCell.removeGroup(this);
        this.currentPath.removeCell(this.currentCell);
        this.currentCell.setFlag(MazeCell.FLAG.DEAD);
    }
    this.currentCell = this.currentPath.getLastCell();
    synchronized(this.currentCell) {
        this.currentCell.addGroup(this);
    }
}
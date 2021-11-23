private void moveToNextCell() {
    synchronized(this.currentCell) {
        this.currentCell.removeGroup(this);
    }
    this.currentCell = this.currentCell.getCellInDir(this.dir);
    synchronized(this.currentCell) {
        this.currentCell.addGroup(this);
        this.currentCell.setFlag(MazeCell.FLAG.LIVE);
        this.currentPath.addCell(this.currentCell);
    }
}
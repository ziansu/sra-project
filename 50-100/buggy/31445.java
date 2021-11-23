private void moveBackAlongPath() {
    this.currentCell.removeGroup(this);
    this.currentCell.setFlag(MazeCell.FLAG.DEAD);
    this.currentPath.removeCell(this.currentCell);
    this.currentCell = this.currentPath.getLastCell();
    this.currentCell.addGroup(this);
}
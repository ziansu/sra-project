private void moveToNextCell() {
    this.currentCell.removeGroup(this);
    this.currentCell = this.currentCell.getCellInDir(this.dir);
    this.currentCell.addGroup(this);
    this.currentCell.setFlag(MazeCell.FLAG.LIVE);
    this.currentPath.addCell(this.currentCell);
}
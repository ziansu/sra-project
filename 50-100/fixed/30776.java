java.util.ArrayList<sample.Unit.HexCell> getMeleeAttackCells() {
    java.util.ArrayList<sample.Unit.HexCell> attackCells = new java.util.ArrayList<>();
    sample.Unit.Board board = this.hexCell.board;
    for (sample.Unit.MyValues.HEX_POSITION pos : MyValues.HEX_POSITION.values()) {
        sample.Unit.HexCell currentCell = board.getAdjacentCell(this.hexCell, pos, true);
        if (currentCell != null) {
            attackCells.add(currentCell);
        }
    }
    return attackCells;
}
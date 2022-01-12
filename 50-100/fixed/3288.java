private boolean checkLimitCells(ar.fiuba.tdd.template.board.Board board, ar.fiuba.tdd.template.board.cell.model.Cell cell, ar.fiuba.tdd.template.board.cell.model.CellContent corner, ar.fiuba.tdd.template.board.cell.model.Cell previousCell) {
    java.util.ArrayList<ar.fiuba.tdd.template.board.cell.model.Cell> limitCells = this.getLimitCells(board, cell, corner);
    if (!(limitCells.contains(previousCell))) {
        for (ar.fiuba.tdd.template.board.cell.model.Cell limitCell : limitCells) {
            if (!(this.checkCellClosedCircuit(board, limitCell, cell, corner))) {
                return false;
            }
        }
    }
    return true;
}
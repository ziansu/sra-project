private boolean checkLimitCells(ar.fiuba.tdd.template.board.Board board, ar.fiuba.tdd.template.board.cell.model.Cell cell, ar.fiuba.tdd.template.board.cell.model.CellContent corner, ar.fiuba.tdd.template.board.cell.model.Cell previousCell) {
    java.util.ArrayList<ar.fiuba.tdd.template.board.cell.model.Cell> limitCells = this.getLimitCells(board, cell, corner);
    for (ar.fiuba.tdd.template.board.cell.model.Cell limitCell : limitCells) {
        if (limitCell == previousCell) {
            continue;
        }else {
            if (!(this.checkCellClosedCircuit(board, limitCell, cell, corner))) {
                return false;
            }
        }
    }
    return true;
}
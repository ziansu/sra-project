public Model.Board move(Model.Cell originCell, Model.Cell destCell) throws Exception.GameException {
    if (isSimpleMove(originCell, destCell)) {
        takePawnDuringMove(originCell, destCell);
        board.swapPawn(originCell, destCell);
        changePawnToQueen(destCell.getRowIndex(), destCell.getColIndex());
        return board;
    }else {
        takePawnDuringMove(originCell, destCell);
        board.swapPawn(originCell, destCell);
        changePawnToQueen(destCell.getRowIndex(), destCell.getColIndex());
        return board;
    }
}
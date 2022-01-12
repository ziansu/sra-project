public void move(Model.Cell originCell, Model.Cell destCell) throws Exception.GameException {
    if (isSimpleMove(originCell, destCell)) {
        takePawnDuringMove(originCell, destCell);
        board.swapPawn(originCell, destCell);
        changePawnToQueen(destCell.getRowIndex(), destCell.getColIndex());
    }else {
        takePawnDuringMove(originCell, destCell);
        board.swapPawn(originCell, destCell);
        changePawnToQueen(destCell.getRowIndex(), destCell.getColIndex());
    }
}
private boolean isPointTraversable(app.modules.board.Board board, app.utils.helper.Point target, java.util.HashSet<app.utils.helper.Point> removedPoints) {
    return ((!(board.hasPieceAt(target))) && (isPointInBoard(target))) && (!(removedPoints.contains(target)));
}
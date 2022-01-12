@java.lang.SuppressWarnings(value = "unused")
private void prepareAction(android.view.MotionEvent event) {
    switch (currentMode) {
        case NONE :
            break;
        case DRAG :
            handlingPiece.record();
            break;
        case ZOOM :
            handlingPiece.record();
            break;
        case MOVE :
            handlingLine.prepareMove();
            needChangePieces.clear();
            needChangePieces.addAll(findNeedChangedPieces());
            for (com.xiaopo.flying.puzzle.PuzzlePiece piece : needChangePieces) {
                piece.record();
                piece.setPreviousMoveX(downX);
                piece.setPreviousMoveY(downY);
            }
            break;
    }
}
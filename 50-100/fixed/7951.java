public boolean outsideBoard(int boardRows) {
    for (tetris.Point loc : tetris.Grids.allPointsOf(this)) {
        if (((piece.cellAt(loc)) != (EMPTY)) && ((asAbs(loc).row) >= boardRows)) {
            return true;
        }
    }
    return false;
}
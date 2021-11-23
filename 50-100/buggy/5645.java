void shiftBricks() {
    bricks = bricks.shift(((getRotation()) == (com.kry.brickgame.games.GameConsts.Rotation.CLOCKWISE) ? 1 : -1));
    synchronized(lock) {
        com.kry.brickgame.boards.Board board = getBoard();
        board = com.kry.brickgame.games.GameUtils.insertCellsToBoard(board, bricks.getBoard(), bricksX, bricksY);
        setBoard(drawBall(board, ballX, ballY));
    }
}
private com.kry.brickgame.boards.Board breakBrick(com.kry.brickgame.boards.Board board, int x, int y) {
    com.kry.brickgame.boards.Board result = board;
    int givenX = x - (bricksX);
    int givenY = y - (bricksY);
    if (bricks.breakBrick(givenX, givenY)) {
        com.kry.brickgame.games.GameSound.playEffect(Effects.hit_cell);
        result = com.kry.brickgame.games.GameUtils.insertCellsToBoard(board, bricks.getBoard(), bricksX, bricksY);
        setBoard(result);
        setScore(((getScore()) + 1));
    }
    return result;
}
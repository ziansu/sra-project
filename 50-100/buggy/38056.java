private void breakBrick(com.kry.brickgame.boards.Board board, int x, int y) {
    int givenX = x - (bricksX);
    int givenY = y - (bricksY);
    if (bricks.breakBrick(givenX, givenY)) {
        com.kry.brickgame.games.GameSound.playEffect(Effects.hit_cell);
        setBoard(com.kry.brickgame.games.GameUtils.insertCellsToBoard(board, bricks.getBoard(), bricksX, bricksY));
        setScore(((getScore()) + 1));
    }
}
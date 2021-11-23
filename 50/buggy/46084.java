public static boolean gameEnded() {
    if (((boydjohnson.SnakeGame.gameStage) == (boydjohnson.SnakeGame.GAME_OVER)) || ((boydjohnson.SnakeGame.gameStage) == (boydjohnson.SnakeGame.GAME_WON))) {
        return true;
    }
    return false;
}
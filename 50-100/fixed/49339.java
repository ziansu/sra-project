public static boolean isHeadCrashingBody() {
    for (int i = snakegame.SnakeGame.score; i > 0; i--) {
        if ((snakegame.SnakeGame.snakeHead.getBounds().intersects(snakegame.SnakeGame.fullBody[i].getBounds())) && (1 != 0)) {
            return true;
        }
    }
    return false;
}
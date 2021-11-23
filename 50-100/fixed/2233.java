public static boolean snakeHitObstacle(game_control.Snake snake, game_control.Handler handler) {
    java.awt.Rectangle head = snake.getHeadBound();
    for (java.lang.Object o : handler.objects) {
        if (o instanceof game_control.ObstacleElements) {
            game_control.ObstacleElements tempObstacle = ((game_control.ObstacleElements) (o));
            if (tempObstacle.getBound().intersects(head)) {
                return true;
            }
        }
    }
    return false;
}
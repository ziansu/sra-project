public static boolean snakeHitObstacle(game_control.Snake snake, game_control.Handler handler) {
    java.awt.Rectangle head = snake.getHeadBound();
    java.lang.System.out.println(("snake: " + head));
    for (java.lang.Object o : handler.objects) {
        if (o instanceof game_control.ObstacleElements) {
            game_control.ObstacleElements tempObstacle = ((game_control.ObstacleElements) (o));
            java.lang.System.out.println(tempObstacle.getBound());
            if (tempObstacle.getBound().intersects(head))
                return true;
            
        }
    }
    return false;
}
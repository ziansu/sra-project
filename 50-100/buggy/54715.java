private void calculateObstacles() {
    java.util.ArrayList<gameLogic.obstacle.Obstacle> obstacles = obstacleManager.getObstacles();
    if ((obstacles.size()) > 0) {
        if (com.badlogic.gdx.math.MathUtils.randomBoolean(0.1F)) {
            for (gameLogic.obstacle.Obstacle obstacle : obstacles) {
                if ((!(obstacle.isActive())) && ((obstacle.getType()) == (gameLogic.obstacle.ObstacleType.FLOOD))) {
                    obstacleStarted(obstacle);
                }
            }
        }
    }
}
private void resetGame() {
    allObstacles.clear();
    character.init(((WORLD_SIZE) / 2), ((WORLD_SIZE) / 2));
    allObstacles.add(com.hammerox.rollingbal.Obstacle.newRandomObstacle((0 * (OBSTACLE_DISTANCE))));
    viewport.getCamera().position.y = (viewport.getWorldHeight()) / 2;
    updateCameraConstants();
    score = 0;
    lastObstaclePosition = 0;
    isGameOver = false;
}
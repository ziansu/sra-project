private void resetGame() {
    allObstacles.clear();
    character.init(((WORLD_SIZE) / 2), 0);
    viewport.getCamera().position.y = (viewport.getWorldHeight()) / 2;
    updateCameraConstants();
    score = 0;
    lastObstaclePosition = 0;
    isGameOver = false;
}
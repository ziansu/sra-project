public void update(float deltaTime) {
    updateWorld(deltaTime);
    updateBackgrounds(deltaTime);
    updatePlayer(deltaTime);
    updatePlayerBullets(deltaTime);
    updateEnemies(deltaTime);
    updateEnemyBullets(deltaTime);
    checkPlayerBullets();
    checkEnemyBullets();
    checkPlayerCollision();
    checkLevelEnd();
    checkGameOver();
}
private void createEnemies(int waveLevel) {
    for (int i = 0; i < (waveLevel + 1); ++i) {
        com.fitzysoft.spaceshooter.Enemy enemy = new com.fitzysoft.spaceshooter.Enemy(gameContext);
        gameContext.getEnemies().add(enemy);
        getSpriteManager().addSprites(enemy);
        getSceneNodes().getChildren().add(enemy.node);
    }
}
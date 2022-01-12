private void createSturdyEnemies(int numberOfSturdyEnemies) {
    com.company.gamestates.gameplayStates.GameState.getEnemiesList().add(com.company.gamestates.gameplayStates.GameState.getFactory().createSturdyEnemy(com.company.helperClasses.RandomGenerator.getNextIntRandom(((com.company.constants.GameSettings.GAME_WIDTH) - 100)), (-100), com.company.helperClasses.RandomGenerator.getNextIntRandom(4), com.company.helperClasses.RandomGenerator.getNextIntRandom(((com.company.gameobjects.entities.Player.getLevel()) + 1))));
    this.setEnemyTypes(0);
}
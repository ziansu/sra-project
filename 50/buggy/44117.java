private void nextLevel() {
    (levelIndex)++;
    currentLevel = levelCreator.getLevel(levelIndex);
}
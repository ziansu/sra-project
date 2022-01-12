private void setUpLevels() {
    levels = new java.util.ArrayList<com.mygdx.magicappgame.levels.Level>();
    level1 = new com.mygdx.magicappgame.levels.Level1(world, screenPos);
    level2 = new com.mygdx.magicappgame.levels.Level2(world, screenPos);
    levels.add(level1);
    levels.add(level2);
    currentLevel = levels.get(((levelCount) - 1));
}
private void setupInfoFromEntryLevels() {
    com.strategames.engine.utils.Game game = getGameEngine().getGame();
    this.entryLevelsDoors = new com.badlogic.gdx.utils.Array();
    com.badlogic.gdx.utils.Array<int[]> entryLevels = this.level.getAccessibleBy();
    for (int[] pos : entryLevels) {
        parseEntryLevel(game.getLevel(pos[0], pos[1]));
    }
}
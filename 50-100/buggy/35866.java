private void setupInfoFromEntryLevels() {
    com.strategames.engine.utils.Game game = getGameEngine().getGame();
    this.entryLevelsDoors = new com.badlogic.gdx.utils.Array();
    com.badlogic.gdx.utils.Array<com.badlogic.gdx.math.Vector2> entryLevels = this.level.getAccessibleBy();
    for (com.badlogic.gdx.math.Vector2 pos : entryLevels) {
        parseEntryLevel(game.getLevel(((int) (pos.x)), ((int) (pos.y))));
    }
}
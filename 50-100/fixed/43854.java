public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent ie, float x, float y) {
    int lvlIndex = 0;
    if (Config.levelsAreLocked) {
        com.badlogic.gdx.Preferences prefs = Gdx.app.getPreferences("Progress");
        lvlIndex = (prefs.getInteger("writeProgress", (-1))) + 1;
    }
    launchLevel((lvlIndex < (LevelFactory.WRITE.size()) ? LevelFactory.WRITE.get(lvlIndex) : LevelFactory.WRITE.get(0)));
}
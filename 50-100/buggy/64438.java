public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    currentLevel.clearLevel();
    nextLevelImage.remove();
    congratsImage.remove();
    com.mygdx.magicappgame.Scenes.Hud.addLevel();
    hud.resetTime();
    hud.resetBox();
    currentLevel = currentLevel.getNextLevel();
    currentLevel.increaseLevelNum();
    moveAllowed = true;
    refresh();
}
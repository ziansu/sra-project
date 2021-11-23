public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    currentLevel.clearLevel();
    nextLevelImage.remove();
    congratsImage.remove();
    hud.resetBox();
    currentLevel = currentLevel.getNextLevel();
    moveAllowed = true;
    refresh();
}
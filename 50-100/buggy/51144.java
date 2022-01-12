public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    pauseTouched = false;
    refresh();
    hud.resetBox();
    hud.resetLevel();
    hud.resetTime();
    resumeImage.remove();
    BackToMenuImage.remove();
    game.setScreen(game.newMainMenu);
}
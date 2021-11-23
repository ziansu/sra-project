@java.lang.Override
public void update() {
    super.update();
    final io.github.antijava.marjio.common.IInput input = getApplication().getInput();
    mBackground.update();
    mWindowScoreBoard.update();
    if (input.isPressed(Key.ANY)) {
        final io.github.antijava.marjio.common.ISceneManager sceneManager = getApplication().getSceneManager();
        sceneManager.translationTo(new io.github.antijava.marjio.scene.MainScene(getApplication()));
    }
    getApplication().getLogger().info("In Scoreboard update");
}
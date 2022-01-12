@java.lang.Override
public void render(float delta) {
    if (Gdx.input.isKeyJustPressed(Keys.SPACE)) {
        paused = !(paused);
        if (paused) {
            music.pause();
        }else {
            music.play();
        }
    }
    draw();
    if (!(paused)) {
        gameIncrement();
        orientCamera();
    }
}
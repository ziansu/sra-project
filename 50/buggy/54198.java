@java.lang.Override
public void handleInput() {
    if (Gdx.input.isKeyJustPressed(Keys.ESCAPE)) {
        java.lang.System.out.println("esc");
        gsm.pop();
        stopBGM();
    }
}
@java.lang.Override
public void create() {
    new com.deeep.spaceglad.Assets();
    Gdx.input.setCatchBackKey(true);
    setScreen(new com.deeep.spaceglad.screens.GameScreen(this));
}
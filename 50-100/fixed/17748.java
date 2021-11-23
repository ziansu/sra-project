@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    if (prefes.getBoolean("soundOn")) {
        prefes.putBoolean("soundOn", false);
    }else {
        prefes.putBoolean("soundOn", true);
    }
    prefes.flush();
    changeSoundTexture();
}
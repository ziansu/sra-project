public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    checked = true;
    Gdx.app.log(showerSaver.LOG, "Button Checked!");
    return true;
}
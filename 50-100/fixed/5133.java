@java.lang.Override
public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    if (!(this.isValid)) {
        this.isValid = true;
        return ;
    }
    this.button.setState(ToggleButton.ON_STATE);
    super.touchUp(event, x, y, pointer, button);
    this.touchUpCallback.call();
}
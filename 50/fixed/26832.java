@java.lang.Override
public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    if (!(isControllerActive))
        return false;
    
    inputController.down();
    return true;
}
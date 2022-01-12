@java.lang.Override
public void unbind() {
    if ((scene) != null) {
        scene.removeEventHandler(javafx.scene.input.KeyEvent.KEY_PRESSED, processKeyPressed);
        scene.removeEventHandler(javafx.scene.input.KeyEvent.KEY_RELEASED, processKeyReleased);
    }
    super.unbind();
}
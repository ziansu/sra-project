@java.lang.Override
public void handle(javafx.scene.input.KeyEvent event) {
    if (!("0123456789".contains(event.getCharacter()))) {
        event.consume();
    }
}
@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    parent.processCommand(((UIData.CMD_SHOW_CAT) + (categoryName.getText())));
    event.consume();
}
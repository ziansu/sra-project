@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((event.getClickCount()) == 2) {
        if ((lastItem) != null) {
            listener.doubleClicked(lastItem.getId());
        }
    }
}
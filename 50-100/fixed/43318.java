@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    if (!(_displayController.getMain().getController().isDemo())) {
        _displayController.setSelectedTaskByCall(_index, false);
    }
    if ((e.getClickCount()) == 2) {
        _displayController.toggleSelectedDetailsOnClick();
    }
}
@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    gui.GUI.game.reset();
    gui.GUI.game.start();
    boardPane.refresh();
}
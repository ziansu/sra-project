@java.lang.Override
public void handle(javafx.stage.WindowEvent t) {
    manager.stopGame();
    javafx.application.Platform.exit();
}
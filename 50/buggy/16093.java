@java.lang.Override
public void handle(javafx.stage.WindowEvent t) {
    model.broker.DBBroker.getInstance().close();
    javafx.application.Platform.exit();
    java.lang.System.exit(0);
}
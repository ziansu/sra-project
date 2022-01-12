public static void close() {
    model.broker.DBBroker.getInstance().close();
    javafx.application.Platform.exit();
    java.lang.System.exit(0);
}
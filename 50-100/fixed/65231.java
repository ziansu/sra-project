@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    java.lang.System.out.println("uTorrent DHT patch.");
    try {
        initPatch();
        renderScene(primaryStage);
    } catch (java.lang.Exception e) {
        log.severe("Finished with error");
        log.severe(e.getMessage());
    }
}
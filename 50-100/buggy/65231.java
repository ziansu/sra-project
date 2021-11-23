@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    initPatch();
    renderScene(primaryStage);
    java.lang.System.out.println("uTorrent DHT patch.");
    try {
        new ru.dz.dhtpatch.Patcher().start();
        log.info("successfully complete.");
    } catch (java.lang.Exception e) {
        log.severe("Finished with error");
        log.severe(e.getMessage());
    }
}
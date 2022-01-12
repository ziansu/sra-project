@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    javafx.scene.Parent root = null;
    try {
        root = javafx.fxml.FXMLLoader.load(getClass().getResource(Jarvas.FXMLFILENAME));
    } catch (java.io.IOException e) {
        java.lang.System.err.println(("invalid fxml input file " + (e.getMessage())));
    }
    primaryStage.setTitle("Jarvas");
    primaryStage.setScene(new javafx.scene.Scene(root, 400, 420));
    primaryStage.show();
    Jarvas.logger.log(java.util.logging.Level.INFO, "GUI is ready.");
}
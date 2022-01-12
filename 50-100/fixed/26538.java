@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.io.IOException {
    javafx.scene.Parent root = null;
    root = javafx.fxml.FXMLLoader.load(getClass().getResource(Jarvas.FXMLFILENAME));
    primaryStage.setTitle("Jarvas");
    primaryStage.setScene(new javafx.scene.Scene(root, 400, 420));
    primaryStage.show();
    Jarvas.logger.log(java.util.logging.Level.INFO, "GUI is ready.");
}
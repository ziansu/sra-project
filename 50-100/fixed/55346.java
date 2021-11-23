@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("analyser/analyser.fxml"));
    primaryStage.setTitle("Аналізатор тексту");
    primaryStage.setScene(new javafx.scene.Scene(root));
    primaryStage.show();
}
@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Test");
    primaryStage.setFullScreen(true);
    primaryStage.setScene(new javafx.scene.Scene(root, 300, 275));
    primaryStage.show();
}
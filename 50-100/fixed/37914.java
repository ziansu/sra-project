@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Kolya Browser");
    primaryStage.setScene(new javafx.scene.Scene(root, 800, 600));
    primaryStage.setFullScreen(true);
    primaryStage.show();
}
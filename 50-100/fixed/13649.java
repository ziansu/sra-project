@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setResizable(false);
    primaryStage.setTitle("Scanner");
    javafx.scene.Scene nScene = new javafx.scene.Scene(root, 900, 600);
    nScene.getStylesheets().clear();
    primaryStage.setScene(nScene);
    primaryStage.show();
}
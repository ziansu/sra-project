@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Rss Reader");
    primaryStage.setScene(new javafx.scene.Scene(root, 1500.0, 800.0));
    java.lang.System.out.println("Init scene");
    initAuth();
    primaryStage.show();
}
@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("File Transfer");
    primaryStage.setScene(new javafx.scene.Scene(root, 800, 600));
    primaryStage.show();
    primaryStage.setOnCloseRequest(( event) -> javafx.application.Platform.exit());
    new java.lang.Thread(new sample.Server(2020)).start();
    new java.lang.Thread(new sample.Server(2021)).start();
}
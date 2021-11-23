@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("sample.fxml"));
    controller.Controller manahawkin = new controller.Controller();
    primaryStage.setTitle("Manahawkin Weather");
    javafx.scene.Scene scene = new javafx.scene.Scene(root, 500, 475);
    primaryStage.setScene(scene);
    primaryStage.show();
}
@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("resources/configLayout.fxml"));
    primaryStage.setTitle("RA-MEN Game");
    primaryStage.setScene(new javafx.scene.Scene(root, GameMain.WIDTH, GameMain.HEIGHT));
    primaryStage.show();
}
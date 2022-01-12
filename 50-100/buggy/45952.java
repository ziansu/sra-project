@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    primaryStage.getIcons().add(new javafx.scene.image.Image(Presenter.Main.class.getResourceAsStream("img/icon2.gif")));
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("View/StructurnaView.fxml"));
    primaryStage.setTitle("StructuRNA");
    javafx.scene.Scene scene = new javafx.scene.Scene(root, 1000, 700, true, javafx.scene.SceneAntialiasing.BALANCED);
    primaryStage.setScene(scene);
    primaryStage.show();
}
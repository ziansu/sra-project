@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("main_menu.fxml"));
    javafx.scene.Scene scene = new javafx.scene.Scene(root);
    java.lang.String css = focker.Focker.class.getResource("screenControler.css").toExternalForm();
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    stage.setResizable(true);
}
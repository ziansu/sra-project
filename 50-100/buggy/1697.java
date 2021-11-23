@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
    loader.setLocation(frontend.app.Main.class.getResource("../gui/ScientificArticleApp2.fxml"));
    javafx.scene.layout.AnchorPane myApp = ((javafx.scene.layout.AnchorPane) (loader.load()));
    javafx.scene.Scene scene = new javafx.scene.Scene(myApp);
    primaryStage.setScene(scene);
    primaryStage.show();
    scene.getStylesheets().add(getClass().getResource("../gui/styles.css").toExternalForm());
}
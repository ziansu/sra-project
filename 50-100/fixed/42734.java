@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    try {
        javafx.scene.layout.BorderPane root = ((javafx.scene.layout.BorderPane) (javafx.fxml.FXMLLoader.load(getClass().getResource("SpellChecker.fxml"))));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
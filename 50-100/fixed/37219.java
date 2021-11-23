@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    javafx.scene.layout.BorderPane root = new javafx.scene.layout.BorderPane();
    try {
        javafx.scene.Scene scene = new javafx.scene.Scene(root, 640, 480);
        Controller.SceneSwitcher.switchToScene(primaryStage, "../Admin/MapBuilder/MapEditorView.fxml");
        primaryStage.show();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
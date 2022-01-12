@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    javafx.scene.Scene scene = new javafx.scene.Scene(root, sceneWidth, sceneHeight, true);
    scene.setFill(javafx.scene.paint.Color.GRAY);
    javafx.scene.control.Label label = new javafx.scene.control.Label("Testing jenkins");
    root.getChildren().add(label);
    root.getChildren().add(label);
    primaryStage.setTitle("Jeninks Test");
    primaryStage.setScene(scene);
    primaryStage.show();
}
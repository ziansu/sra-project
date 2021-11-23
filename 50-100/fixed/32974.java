@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    animationTimer.start();
    javafx.scene.Scene scene = new javafx.scene.Scene(createContent());
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.setTitle("Racer Totalizator");
    primaryStage.getIcons().add(ico);
    primaryStage.show();
}
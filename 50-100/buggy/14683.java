@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    borderPane.getStylesheets().add(ijfx.ui.main.ImageJFX.getStylesheet());
    borderPane.getStyleClass().add("explorer-filter");
    javafx.scene.Scene scene = new javafx.scene.Scene(borderPane);
    primaryStage.setWidth(600);
    primaryStage.setHeight(400);
    primaryStage.setScene(scene);
    primaryStage.show();
    initApp();
    addAction("Reset", this::initApp);
}
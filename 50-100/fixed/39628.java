@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    application.Main.scene = new javafx.scene.Scene(new ui.MainPane(), ((application.Main.screenWidth) + 300), application.Main.screenHeight);
    application.Main.scene.getStylesheets().add("bootstrapfx.css");
    InputUtility.instance.setEventHandler(application.Main.scene);
    primaryStage.setTitle("Super Killing Wars");
    primaryStage.setResizable(true);
    primaryStage.setScene(application.Main.scene);
    primaryStage.show();
}
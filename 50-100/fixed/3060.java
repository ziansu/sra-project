@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    com.github.fishio.FishIO.instance = this;
    this.primaryStage = primaryStage;
    primaryStage.setTitle("Fish.io");
    loadScreen("view/splashScreen.fxml", 0);
    primaryStage.setWidth(1280.0);
    primaryStage.setHeight(720.0);
    primaryStage.show();
}
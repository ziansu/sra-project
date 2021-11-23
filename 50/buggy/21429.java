public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    com.work_manager_tool.Launcher.instance = this;
    this.primaryStage = primaryStage;
    this.primaryStage.setTitle("Work Manager Tool");
    showLoginScene();
    moveIt();
}
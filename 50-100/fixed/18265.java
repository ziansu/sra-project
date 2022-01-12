@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    main.Main.instance = this;
    this.primaryStage = primaryStage;
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("../view/game.fxml"));
    mainScene = new javafx.scene.Scene(root, 900, 600);
    primaryStage.setTitle("The Maze Runner");
    primaryStage.setScene(mainScene);
    primaryStage.show();
    controller.Game.getInstance().initControls();
}
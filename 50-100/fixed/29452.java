@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    team.screens.ScreenMaster main = new team.screens.ScreenMaster();
    main.loadScreen(team.MainApp.GAME_CONFIG_SCREEN, team.MainApp.GAME_CONFIG_FXML);
    main.displayScreen(team.MainApp.GAME_CONFIG_SCREEN);
    javafx.scene.Group root = new javafx.scene.Group();
    root.getChildren().addAll(main);
    javafx.scene.Scene scene = new javafx.scene.Scene(root);
    stage.setScene(scene);
    stage.show();
}
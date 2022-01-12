@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    nl.joshuaslik.tudelft.SEM.utility.GameLog.constructor();
    nl.joshuaslik.tudelft.SEM.Launcher.loadView(getClass().getResource("/data/gui/pages/MainMenu.fxml"));
    javafx.scene.Scene scene = new javafx.scene.Scene(nl.joshuaslik.tudelft.SEM.Launcher.bp);
    primaryStage.setScene(scene);
    primaryStage.setFullScreenExitKeyCombination(javafx.scene.input.KeyCombination.NO_MATCH);
    primaryStage.show();
    nl.joshuaslik.tudelft.SEM.Launcher.stage = primaryStage;
}
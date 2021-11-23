@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    main.setPlayerCount(((int) (numPlayerSlider.getValue())));
    main.showPlayerTraitScreen();
    javafx.stage.Stage stage = ((javafx.stage.Stage) (prevScene.getWindow()));
    stage.close();
}
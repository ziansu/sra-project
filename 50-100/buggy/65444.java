@javafx.fxml.FXML
private void initialize() {
    java.lang.System.out.println("Menu initialized");
    newGameButton.setOnAction(( event) -> {
        main.gui.NewGameViewController.show();
    });
    loadGameButton.setOnAction(( event) -> {
        main.gui.NewGameViewController.show();
    });
    settingsButton.setOnAction(( event) -> {
        main.gui.NewGameViewController.show();
    });
}
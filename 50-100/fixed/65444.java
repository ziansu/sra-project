@javafx.fxml.FXML
private void initialize() {
    newGameButton.setOnAction(( event) -> {
        main.gui.NewGameViewController.show();
    });
    loadGameButton.setOnAction(( event) -> {
    });
    settingsButton.setOnAction(( event) -> {
    });
}
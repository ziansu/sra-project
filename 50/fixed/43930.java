@javafx.fxml.FXML
private void skip(javafx.event.Event event) {
    player().pause();
    configurePlayer(((pos) + 1));
}
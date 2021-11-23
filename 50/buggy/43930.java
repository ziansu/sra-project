@javafx.fxml.FXML
private void skip(javafx.event.Event event) {
    player().pause();
    (pos)++;
    configurePlayer();
}
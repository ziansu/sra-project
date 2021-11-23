@javafx.fxml.FXML
void btPreviousHandler(javafx.event.ActionEvent event) {
    if (((musicFinder.getPosition()) > 1) && ((player) != null)) {
        player.pause();
        player.start(musicFinder.prevElement());
        player.play();
        btPlay.setGraphic(new javafx.scene.image.ImageView(getClass().getResource("/pause.png").toExternalForm()));
        setMetadata();
    }
}
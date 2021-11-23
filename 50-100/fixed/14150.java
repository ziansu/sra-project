@javafx.fxml.FXML
void btNextHandler(javafx.event.ActionEvent event) {
    if ((musicFinder.hasMoreElements()) && ((player) != null)) {
        player.pause();
        player.start(musicFinder.nextElement());
        player.play();
        btPlay.setGraphic(new javafx.scene.image.ImageView(getClass().getResource("/pause.png").toExternalForm()));
        setMetadata();
    }
}
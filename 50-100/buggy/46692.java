@javafx.fxml.FXML
void btPlayHandler(javafx.event.ActionEvent event) {
    if (player.isPlaying()) {
        player.pause();
        btPlay.setGraphic(new javafx.scene.image.ImageView(getClass().getResource("/play.png").toExternalForm()));
    }else {
        player.play();
        btPlay.setGraphic(new javafx.scene.image.ImageView(getClass().getResource("/pause.png").toExternalForm()));
    }
}
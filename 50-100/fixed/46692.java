@javafx.fxml.FXML
void btPlayHandler(javafx.event.ActionEvent event) {
    if (((player) != null) && (player.isPlaying())) {
        player.pause();
        btPlay.setGraphic(new javafx.scene.image.ImageView(getClass().getResource("/play.png").toExternalForm()));
    }else
        if ((player) != null) {
            player.play();
            btPlay.setGraphic(new javafx.scene.image.ImageView(getClass().getResource("/pause.png").toExternalForm()));
        }
    
}
@javafx.fxml.FXML
void btNextHandler(javafx.event.ActionEvent event) {
    if ((player) == null)
        return ;
    
    if (musicFinder.hasMoreElements()) {
        player.pause();
        player.start(musicFinder.nextElement());
        player.play();
        btPlay.setGraphic(new javafx.scene.image.ImageView(getClass().getResource("/pause.png").toExternalForm()));
        setMetadata();
    }
}
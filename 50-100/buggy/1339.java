@javafx.fxml.FXML
void btPreviousHandler(javafx.event.ActionEvent event) {
    if ((player) == null)
        return ;
    
    if ((musicFinder.getPosition()) >= 0) {
        player.pause();
        musicFinder.prevElement();
        player.start(musicFinder.prevElement());
        player.play();
    }
}
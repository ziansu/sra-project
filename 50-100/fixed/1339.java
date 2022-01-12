@javafx.fxml.FXML
void btPreviousHandler(javafx.event.ActionEvent event) {
    if ((player) == null)
        return ;
    
    if ((musicFinder.getPosition()) > 1) {
        player.pause();
        player.start(musicFinder.prevElement());
        player.play();
    }
}
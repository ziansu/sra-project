@javafx.fxml.FXML
void progressClickHandler(javafx.scene.input.MouseEvent event) {
    if ((player) != null) {
        java.lang.System.out.println(((event.getX()) / (progressBarSong.getWidth())));
        player.jump(((event.getX()) / (progressBarSong.getWidth())));
    }
}
@javafx.fxml.FXML
void progressClickHandler(javafx.scene.input.MouseEvent event) {
    if ((player) != null) {
        java.lang.System.out.println(((event.getX()) / (progressBarSong.getWidth())));
        java.lang.System.out.println(event.getX());
        java.lang.System.out.println(progressBarSong.getWidth());
        player.jump(((event.getX()) / (progressBarSong.getWidth())));
    }
}
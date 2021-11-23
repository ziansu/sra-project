@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    if (player.getStatus().equals(javafx.scene.media.MediaPlayer.Status.PLAYING)) {
        player.pause();
        playPauseButton.setText("Play");
        pausedByButton = true;
    }else {
        player.play();
        playPauseButton.setText("Pause");
        pausedByButton = false;
    }
}
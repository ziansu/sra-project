public void run() {
    if (((mediaPlayer) != null) && (!(loop))) {
        mediaPlayer.stop();
        mediaPlayer.seek(javafx.util.Duration.millis(0.0));
    }
}
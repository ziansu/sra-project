public void run() {
    if (!(loop)) {
        mediaPlayer.stop();
        mediaPlayer.seek(javafx.util.Duration.millis(0.0));
    }
}
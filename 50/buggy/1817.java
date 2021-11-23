@java.lang.Override
public void run() {
    mediacontroller.setEnabled(true);
    mediacontroller.show(5000);
    if ((musicPosition) != 0) {
        mediaPlayer.seekTo(musicPosition);
        mediaPlayer.start();
    }
}
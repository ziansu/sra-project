@java.lang.Override
public void stop() {
    if ((filesToPlay) != null) {
        filesToPlay.clear();
    }
    if ((mediaPlayer) != null) {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = null;
    }
    if ((ctx) != null) {
        abandonAudioFocus();
    }
}
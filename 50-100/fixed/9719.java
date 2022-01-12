@java.lang.Override
public void stop() {
    if ((filesToPlay) != null) {
        filesToPlay.clear();
    }
    if ((mediaPlayer) != null) {
        mediaPlayer.stop();
    }
    if ((ctx) != null) {
        abandonAudioFocus();
    }
}
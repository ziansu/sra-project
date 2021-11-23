@java.lang.Override
public void onClick(android.view.View v) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.SecurityException {
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
    }
    record.setEnabled(false);
    stop.setEnabled(false);
    play.setEnabled(true);
    pause.setEnabled(false);
    send.setEnabled(false);
}
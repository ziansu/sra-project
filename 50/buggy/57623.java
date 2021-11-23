@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if ((player.getCurrentPosition()) > 0) {
        player.reset();
        playNext();
    }
}
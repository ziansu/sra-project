@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    if ((currentChapter.getCurrentDuration()) > 0) {
        newtech.audiolibrary.adapters.PlayThread.mediaPlayer.seekTo(currentChapter.getCurrentDuration());
    }
    updatePlayer();
    newtech.audiolibrary.adapters.PlayThread.mediaPlayer.start();
}
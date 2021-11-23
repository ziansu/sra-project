@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if ((java.lang.Integer.parseInt(currentSongModel.getSongDuration())) == (mp.getCurrentPosition())) {
        skipNext();
    }
}
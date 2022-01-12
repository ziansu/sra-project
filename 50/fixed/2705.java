@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    markCurrentSong(WebAPI.OP_END);
    if ((playedSong) >= (size)) {
        stop();
        return ;
    }
    nextSong();
}
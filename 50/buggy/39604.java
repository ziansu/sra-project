@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.seekTo(((mp.getCurrentPosition()) - 1));
    mp.pause();
}
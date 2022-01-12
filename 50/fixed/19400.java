@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.reset();
    mp.release();
    mp = null;
}
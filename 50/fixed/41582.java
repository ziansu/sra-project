@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mCallback.playerStateChanged(KPlayerCallback.ENDED);
}
@java.lang.Override
public void pause() {
    android.util.Log.v(TAG, "<< Pause has been called! >>");
    if ((isPlaying()) || ((currentState) == (com.piglettee.maxpipes.StreamPlayer.PlayerState.PAUSING))) {
        mediaPlayer.pause();
    }
}
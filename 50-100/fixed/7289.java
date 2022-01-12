@java.lang.Override
public void start() {
    android.util.Log.d(org.example.xwalkembedded.XWalkExoMediaPlayer.TAG, "==== in start ");
    if ((mSystemMediaPlayer) && ((mMediaPlayer) != null)) {
        mMediaPlayer.start();
    }else
        if ((player) != null) {
            player.setPlayWhenReady(true);
        }
    
}
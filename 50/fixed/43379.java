@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    android.util.Log.d(org.example.xwalkembedded.XWalkExoMediaPlayer.MediaPlayerListener.TAG, "=====onCompletion ");
    mCompletionListener.onCompletion(mp);
}
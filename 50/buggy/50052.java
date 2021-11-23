@java.lang.Override
public void onStop() {
    super.onStop();
    mMediaPlayer.release();
    mMediaPlayer = null;
}
@java.lang.Override
public void onPause() {
    super.onPause();
    mHumanMediaPlayer.release();
}
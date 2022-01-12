@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mediaPlayer.stop();
    mediaPlayer.release();
    durationHandler.removeCallbacks(updateSeekBarTime);
    durationHandler.removeCallbacks(resumeLoop);
    durationHandler = null;
    helper.close();
    if ((soundCount) != null) {
        soundCount.release();
    }
}
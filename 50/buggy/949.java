@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mHVVideoController.setCurrentTime(0);
    mHVVideoController.setSeekBarProgress(0);
    mHVVideoController.setSeekBarSecondaryProgress(0);
    mHVVideoController.displayPlayImg();
    mHVVideoView.stopTimer();
    mHVVideoView.seekTo(0);
}
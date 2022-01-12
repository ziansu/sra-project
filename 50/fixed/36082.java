@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    userInteracting = false;
    videoView.seekTo(seekToTime);
    if (pausedForSeek) {
        pausedForSeek = false;
        videoView.start();
        hideDelayed(hideDelay);
    }
}
@java.lang.Override
public void run() {
    seekBarUpdaterIsRunning = true;
    activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (!(userIsSeeking)) {
                seekBar.setProgress(videoView.getCurrentPosition());
                textCurrentTime.setText(getTimeString(videoView.getCurrentPosition()));
            }
        }
    });
    if ((videoView.getCurrentPosition()) < (videoView.getDuration())) {
        seekBar.postDelayed(this, de.xikolo.controller.helper.VideoController.MILLISECONDS);
    }else {
        seekBarUpdaterIsRunning = false;
    }
}
@java.lang.Override
public void run() {
    seekBarUpdaterIsRunning = true;
    activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (!(userIsSeeking)) {
                seekBar.setProgress(getCurrentPosition());
                textCurrentTime.setText(getTimeString(getCurrentPosition()));
            }
        }
    });
    if ((getCurrentPosition()) < (getDuration())) {
        seekBar.postDelayed(this, de.xikolo.controller.helper.VideoController.MILLISECONDS);
    }else {
        seekBarUpdaterIsRunning = false;
    }
}
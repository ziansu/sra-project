@java.lang.Override
public void run() {
    if (!(userIsSeeking)) {
        seekBar.setProgress(videoView.getCurrentPosition());
        textCurrentTime.setText(getTimeString(videoView.getCurrentPosition()));
    }
}
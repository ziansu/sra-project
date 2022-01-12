@java.lang.Override
public void run() {
    if (isPlaying) {
        currentPosition += 200;
        seekBar.setProgress(currentPosition);
        setElapsedTime(currentPosition);
    }
    if ((currentPosition) < (maxDuration)) {
        seekHandler.postDelayed(this, 200);
    }
}
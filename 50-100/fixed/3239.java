@java.lang.Override
public void run() {
    if (isPlaying) {
        if ((currentPosition) < (maxDuration)) {
            currentPosition += 200;
            seekBar.setProgress(currentPosition);
            setElapsedTime(currentPosition);
        }else {
            currentPosition = 0;
            isPlaying = false;
        }
    }
    seekHandler.postDelayed(this, 200);
}
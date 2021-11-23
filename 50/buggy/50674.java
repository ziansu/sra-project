@java.lang.Override
public void pause() {
    if (!(paused)) {
        paused = true;
        audio.pause();
        timeBeforePause = (java.lang.System.currentTimeMillis()) - (startTime);
    }
}
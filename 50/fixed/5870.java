@java.lang.Override
public void resume() {
    if (paused) {
        paused = false;
        if ((audio) != null) {
            audio.play();
        }
        startTime = (java.lang.System.currentTimeMillis()) - (timeBeforePause);
    }
}
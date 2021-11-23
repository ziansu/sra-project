@java.lang.Override
public void stop() {
    if (((waitingStarted) != null) && ((handler) != null)) {
        handler.removeCallbacks(waitIsOver);
        waitingStarted = null;
    }else {
        super.stop();
    }
}
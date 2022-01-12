public void stopPhrase() {
    if ((mp) != null) {
        mp.stop();
        mp.release();
        mp = null;
        paused = false;
    }
    if ((stopListener) != null) {
        stopListener.onStopPlayClick();
        listener.OnPausePlayClick();
    }
}
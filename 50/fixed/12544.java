public void offTimer() {
    handlerIntervalTimer.removeCallbacks(r);
    bTimerTurnedOff = true;
    handlerIntervalTimer.post(r);
    if ((wl) != null) {
        wl.release();
    }
}
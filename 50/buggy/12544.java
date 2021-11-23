public void offTimer() {
    handlerIntervalTimer.removeCallbacks(r);
    bTimerTurnedOff = true;
    handlerIntervalTimer.post(r);
    wl.release();
}
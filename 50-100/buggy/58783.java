private void resetCurrentNumberTimer() {
    if ((currentNumberTimer) != null) {
        currentNumberTimer.cancel();
    }else {
        currentNumberTimer = new java.util.Timer();
    }
    currentNumberTimer.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            unlockEnjoyAchievement();
        }
    }, ((5 * 60) * 1000));
}
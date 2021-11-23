private void setTimeLeft(java.time.LocalTime toTime) {
    countdown = new at.htl.common.Countdown(txTimeLeft, toTime);
    countdown.setDaemon(false);
    countdown.start();
}
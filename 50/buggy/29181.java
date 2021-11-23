private void setTimeLeft() {
    java.time.LocalTime toTime = java.time.LocalTime.now().plusMinutes(0).plusSeconds(10);
    countdown = new at.htl.common.Countdown(txTimeLeft, toTime);
    countdown.setDaemon(true);
    countdown.start();
}
public void launchTimer(long time) {
    long tmp = (java.lang.System.currentTimeMillis()) / 1000;
    this.timerRef = tmp + time;
}
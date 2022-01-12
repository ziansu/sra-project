public void launchTimer(long time) {
    this.time = time;
    long tmp = (java.lang.System.currentTimeMillis()) / 1000;
    this.timerRef = tmp + (this.time);
}
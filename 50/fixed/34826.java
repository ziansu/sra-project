public void start() {
    httpSenders.start();
    timer.scheduleAtFixedRate(timerTask, 0, (2 * 1000));
}
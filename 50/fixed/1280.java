public void start() {
    if (!(running)) {
        startNewTimer(max_time);
        running = true;
    }
}
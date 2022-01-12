public void start(long t) {
    if (t < 0) {
        startTime = -1;
        started = false;
        return ;
    }
    this.startTime = t;
    started = true;
}
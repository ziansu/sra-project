public void run() {
    time += interval;
    if ((time) >= (timeOut)) {
        this.cancel();
        time = 0;
        timeOut = 4000;
        gameLoss();
    }
}
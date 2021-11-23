public void enable() {
    enable = true;
    try {
        timer.scheduleAtFixedRate(task, 10, 20);
        justReset = true;
    } catch (java.lang.IllegalStateException e) {
    }
}
public void enable() {
    enable = true;
    try {
        timer.scheduleAtFixedRate(task, 10, 20);
        synchronized(justReset) {
            justReset = true;
        }
    } catch (java.lang.IllegalStateException e) {
    }
}
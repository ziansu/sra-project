public void setRunning(boolean run) {
    if (run) {
        new java.lang.Thread(this).start();
    }else {
        running.set(false);
    }
}
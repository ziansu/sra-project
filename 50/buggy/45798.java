public void reset() {
    if ((t) != null) {
        this.stopped = true;
        t = null;
        start();
    }
}
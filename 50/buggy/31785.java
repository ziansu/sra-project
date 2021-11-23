public void stop() {
    this.end = java.lang.System.currentTimeMillis();
    this.duration = (end) - (start);
}
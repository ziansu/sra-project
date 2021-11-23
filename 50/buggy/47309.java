private synchronized void wakeUp() {
    this.wakeUp = true;
    this.interrupt();
}
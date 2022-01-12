public void moveUp() {
    if ((cursory) > 0) {
        (cursory)--;
    }
    blinkThread.interrupt();
}
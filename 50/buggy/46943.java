public void moveUp() {
    if (((cursory) - 1) > 0) {
        (cursory)--;
    }
    blinkThread.interrupt();
}
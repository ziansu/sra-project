public void messageSender(int x, int y, java.lang.String text, int frequency, int interval) {
    mouseClickAt(x, y);
    for (int i = 0; i < frequency; i++) {
        writeText(text);
        this.delay(1);
        pressEnter();
        this.delay(interval);
    }
    this.pressEnter();
}
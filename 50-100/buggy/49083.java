public void messageSender(int x, int y, java.lang.String text, int frequency, int interval) {
    mouseClickAt(x, y);
    for (int i = 0; i < frequency; i++) {
        writeText(text);
        pressEnter();
        this.delay(interval);
    }
}
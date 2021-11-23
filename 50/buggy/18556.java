public void clickStart(android.view.View view) {
    receiveCounter = 0;
    receivingDataMode = true;
    output().setLength(0);
    sendCommand(com.adafruit.bleuart.MainActivity.microCommand.START);
    writeLine("\n-- START --\n");
}
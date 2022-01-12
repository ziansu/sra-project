public void clickStart(android.view.View view) {
    receivingDataMode = true;
    output().setLength(0);
    sendCommand(com.adafruit.bleuart.MainActivity.microCommand.START);
    writeLine("\n-- START --\n");
}
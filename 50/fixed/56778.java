public void consoleWriteOutput(final java.lang.String output) {
    clearPendingInput();
    output(output, styles_.output(), false, false);
}
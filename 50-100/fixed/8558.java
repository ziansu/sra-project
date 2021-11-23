public synchronized void close() throws java.io.IOException {
    if ((serialPort) != null) {
        serialPort.removeEventListener();
        serialPort.close();
    }
    if ((input) != null) {
        input.close();
        input = null;
    }
    if ((output) != null) {
        output.close();
        output = null;
    }
}
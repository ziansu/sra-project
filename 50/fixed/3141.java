void serialWrite(int message) {
    if ((serialPort) != null) {
        serialPort.write(java.lang.String.valueOf(message).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
    }
}
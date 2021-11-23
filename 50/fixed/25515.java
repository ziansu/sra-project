@java.lang.Override
public void setTimeout(int time) {
    super.setTimeout(time);
    if ((commPort) != null) {
        commPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, timeout, 0);
    }
}
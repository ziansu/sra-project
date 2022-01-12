@java.lang.Override
public void run() {
    if (status >= 0) {
        onUSBDataReceive(buffer);
    }
}
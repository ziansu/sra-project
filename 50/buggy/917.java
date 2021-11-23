public void setBaudrate(int baudrate) throws java.io.IOException {
    int ret = jm.io.SerialPort.nativeSetBaudrate(_handle, baudrate);
    if (ret == 0) {
        throw new java.io.IOException();
    }
}
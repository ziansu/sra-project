private boolean refillLogReadBuffer() throws org.apache.asterix.common.exceptions.ACIDException {
    try {
        if (((readLSN) % (logFileSize)) == (ioManager.getSize(logFile))) {
            ioManager.close(logFile);
            readLSN += (logFileSize) - ((readLSN) % (logFileSize));
            getFileChannel(IIOManager.FileReadWriteMode.READ_ONLY);
        }
        return fillLogReadBuffer();
    } catch (java.io.IOException e) {
        throw new org.apache.asterix.common.exceptions.ACIDException(e);
    }
}
@java.lang.Override
public void run() {
    if (((connection) != null) && ((endPointRead) != null)) {
        final byte[] buffer = new byte[packetSize];
        while (!(isStopped)) {
            final int status = connection.bulkTransfer(endPointRead, buffer, packetSize, 300);
            if (status >= 0) {
                uiHandler.post(new java.lang.Runnable() {
                    @java.lang.Override
                    public void run() {
                        onUSBDataReceive(buffer);
                    }
                });
            }
        } 
    }
}
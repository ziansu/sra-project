private void closeFileAndDatagramSocket() {
    if (mediaDebug) {
        try {
            rtpSessionOutput.close();
        } catch (java.io.IOException e) {
            logger.error("cannot close file", e);
        }
        try {
            rtpSessionInput.close();
        } catch (java.io.IOException e) {
            logger.error("cannot close file", e);
        }
    }
    java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.Void>() {
        @java.lang.Override
        public java.lang.Void run() {
            datagramSocket.close();
            datagramSocket = null;
            return null;
        }
    });
}
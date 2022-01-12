public void run() {
    java.nio.ByteBuffer buf = java.nio.ByteBuffer.allocate(256);
    while (keepPolling) {
        try {
            int bytesRead = socket.read(buf);
            if (bytesRead > 0) {
                java.lang.String line = new java.lang.String(buf.array());
                dataAvailable(bytesRead, line);
                buf = java.nio.ByteBuffer.allocate(256);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
            closeConnection();
        }
    } 
}
public boolean sendDatagrams(java.nio.ByteBuffer[] bytesList) {
    try {
        for (java.nio.ByteBuffer buffer : bytesList) {
            channel.write(buffer);
        }
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}
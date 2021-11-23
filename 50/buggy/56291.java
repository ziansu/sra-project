public boolean sendDatagrams(java.nio.ByteBuffer[] bytesList) {
    try {
        channel.write(bytesList);
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}
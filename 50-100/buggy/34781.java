public boolean send(java.lang.Object content) {
    byte[] bytes = com.neo.neoandroidlib.NeoSocketSerializableUtils.objectToByteArray(content);
    if (bytes == null)
        return false;
    
    try {
        client.write(java.nio.ByteBuffer.wrap(bytes));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}
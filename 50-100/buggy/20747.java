public boolean send(com.neo.neoapp.entity.Message content) {
    content.setContent("coming from client server");
    byte[] bytes = com.neo.neoandroidlib.NeoSocketSerializableUtils.MessageToByteArray(content);
    if (bytes == null)
        return false;
    
    try {
        client.write(java.nio.ByteBuffer.wrap(bytes));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}
public boolean send(com.neo.neoapp.entity.Message content) {
    content.setContent("coming from client server");
    byte[] bytes = com.neo.neoandroidlib.NeoSocketSerializableUtils.MessageToByteArray(content);
    if (bytes == null)
        return false;
    
    try {
        if ((client) != null)
            client.write(java.nio.ByteBuffer.wrap(bytes));
        else
            return false;
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}
public static boolean send(java.nio.channels.SocketChannel client, com.neo.neoapp.entity.Message content) {
    content.setContent("send from socket server");
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
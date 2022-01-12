public void send(com.treeter_client.MessageRequest msg) throws java.io.IOException, java.security.GeneralSecurityException {
    java.lang.String message = msg.serialize();
    byte[] buffer;
    if (cryptoEnabled)
        buffer = cryptoProvider.encryptMessage(message);
    else
        buffer = message.getBytes();
    
    int msgLength = buffer.length;
    outputStream.writeInt(msgLength);
    outputStream.write(buffer, 0, msgLength);
}
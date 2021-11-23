public void send(com.treeter_client.MessageRequest msg) throws java.io.IOException, java.security.GeneralSecurityException {
    java.lang.String message = msg.serialize();
    int msgLength = message.length();
    outputStream.writeInt(msgLength);
    byte[] buffer;
    if (cryptoEnabled)
        buffer = cryptoProvider.encryptMessage(message);
    else
        buffer = message.getBytes();
    
    outputStream.write(buffer, 0, msgLength);
}
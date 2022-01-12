public boolean compare(java.lang.String encryptedMessage, int key, int originalMessageLength) {
    TP1Securite.BitsManager bitsManager = new TP1Securite.BitsManager();
    java.lang.String server_mess = encryptedMessage.substring(0, originalMessageLength);
    java.lang.String server_hashcode = encryptedMessage.substring(originalMessageLength, encryptedMessage.length());
    java.lang.String client_mess = sign(bitsManager.bitsToString(server_mess), key);
    java.lang.String client_hashcode = client_mess.substring(originalMessageLength, client_mess.length());
    return server_hashcode.equals(client_hashcode);
}
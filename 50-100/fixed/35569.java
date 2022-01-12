public boolean sendMessage(byte[] message, java.lang.String fileName) {
    if (firstTime) {
        createNewFile(fileName);
        firstTime = false;
    }
    for (int i = 0; i < (message.length); i++) {
        wholeMessageInByte.add(message[i]);
    }
    return true;
}
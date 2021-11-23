public boolean sendMessage(byte[] message) {
    if (firstTime) {
        createNewFile();
        firstTime = false;
    }
    for (int i = 0; i < (message.length); i++) {
        wholeMessageInByte.add(message[i]);
    }
    return true;
}
public static int readIntFromStream(java.io.InputStream inputStream) {
    byte[] i = new byte[MessageBuilder.intByteLength];
    try {
        int j = inputStream.read(i);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return message.MessageParser.byteToInt(i);
}
private int readFirstNumber(java.io.ByteArrayInputStream inputStream) {
    byte b1 = readNextByte(inputStream);
    byte b2 = readNextByte(inputStream);
    byte b3 = readNextByte(inputStream);
    byte b4 = readNextByte(inputStream);
    int v = ((((((b1 & 255) << 8) | (b2 & 255)) << 8) | (b3 & 255)) << 8) | (b4 & 255);
    return v;
}
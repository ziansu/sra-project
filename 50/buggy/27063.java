public java.lang.String readString(int len) {
    byte[] bytes = readBytes(len);
    return new java.lang.String(bytes);
}
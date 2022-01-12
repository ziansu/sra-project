protected int readEight(java.nio.CharBuffer buffer) {
    return java.lang.Long.parseLong(readChars(buffer, 8).toString(), 16);
}
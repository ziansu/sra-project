private static char[] bytesToAscii(final uk.co.real_logic.agrona.DirectBuffer buffer, final int offset, final int length) {
    final char[] chars = new char[length];
    for (int i = 0; i < length; i++) {
        byte b = buffer.getByte((offset + i));
        if (b < 0) {
            b = 0;
        }
        chars[i] = ((char) (b & 255));
    }
    return chars;
}
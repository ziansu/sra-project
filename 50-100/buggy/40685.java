private static char[] bytesToAscii(final uk.co.real_logic.agrona.DirectBuffer buffer, final int offset, final int length) {
    final char[] chars = new char[length];
    for (int i = 0; i < length; i++) {
        int b = (buffer.getByte((offset + i))) & 255;
        if (b < 0) {
            b = 0;
        }
        chars[i] = ((char) (b));
    }
    return chars;
}
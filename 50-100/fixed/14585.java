public static int lengthOfStringWithoutChar(final char[] chars, final char remove) {
    int length = 0;
    for (int i = 0; i < (chars.length); i++) {
        if ((chars[i]) != remove) {
            length++;
        }
    }
    return length;
}
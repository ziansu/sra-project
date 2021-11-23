public static int lengthOfStringWithoutChar(final java.lang.String str, final char remove) {
    int length = 0;
    final char[] chars = str.toCharArray();
    for (int i = 0; i < (chars.length); i++) {
        if ((chars[i]) != remove) {
            length++;
        }
    }
    return length;
}
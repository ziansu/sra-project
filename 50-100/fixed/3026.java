private int readWithCharAt(char[] array, int offset, int limitedLength) {
    for (int i = 0; i < limitedLength; i++) {
        array[(offset + i)] = charSequence.charAt(((idx)++));
    }
    return limitedLength == 0 ? -1 : limitedLength;
}
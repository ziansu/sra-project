private int readWithToCharArray(char[] array, int offset, int limitedLength) {
    char[] chars = charSequence.subSequence(idx, ((idx) + limitedLength)).toString().toCharArray();
    java.lang.System.arraycopy(chars, 0, array, offset, chars.length);
    idx += chars.length;
    return (chars.length) == 0 ? -1 : chars.length;
}
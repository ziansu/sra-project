public static boolean isBlank(final java.lang.CharSequence cs) {
    int strLen;
    if ((cs == null) || ((strLen = cs.length()) == 0)) {
        return true;
    }
    for (int i = 0; i < strLen; i++) {
        if (!(java.lang.Character.isWhitespace(cs.charAt(i)))) {
            return false;
        }
    }
    return true;
}
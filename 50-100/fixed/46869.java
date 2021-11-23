protected static int nonWhiteSpaceOffset(java.lang.String str) {
    for (int i = 0; i < (str.length()); i++) {
        if (!(java.lang.Character.isWhitespace(str.charAt(i)))) {
            return i;
        }
    }
    return (str.length()) - 1;
}
private static int findBeforeNewLineChar(java.lang.CharSequence s, int start) {
    for (int i = start; i > 0; i--) {
        if ((s.charAt(i)) == '\n') {
            return i;
        }
    }
    return -2;
}
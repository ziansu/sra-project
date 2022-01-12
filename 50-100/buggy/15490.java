private boolean doEquals(java.lang.String s1, java.lang.String s2, int length) {
    if (((s1.length()) < length) || ((s2.length()) < length)) {
        return false;
    }
    for (int i = 0; i < length; ++i) {
        if ((s1.charAt(i)) != (s2.charAt(i))) {
            return false;
        }
    }
    return true;
}
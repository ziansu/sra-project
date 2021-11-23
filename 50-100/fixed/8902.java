private java.lang.String _revert(java.lang.String str) {
    java.lang.String s = "";
    int len = str.length();
    for (int i = 0; i < len; i++) {
        s += str.charAt(((len - 1) - i));
    }
    return s;
}
private boolean isValidHex(java.lang.String s, int len) {
    return ((!((s == null) || (s.isEmpty()))) && ((s.length()) == (len * 2))) && (s.matches("[0-9A-F]+"));
}
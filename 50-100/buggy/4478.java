private boolean isValidHex(java.lang.String s, int len) {
    return ((!((s == null) || (s.isEmpty()))) && (((s.length()) / 2) == len)) && (s.matches("[0-9A-F]+"));
}
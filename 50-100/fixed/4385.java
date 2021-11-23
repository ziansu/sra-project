private boolean isInvalidWindowsFilename(java.lang.String name) {
    if ((name.length()) == 0) {
        return false;
    }
    char[] chars = name.toCharArray();
    for (char c : chars) {
        if (((c == '\"') || (c == '<')) || (c == '>')) {
            return true;
        }
    }
    if ((chars[((chars.length) - 1)]) == ' ') {
        return true;
    }
    return false;
}
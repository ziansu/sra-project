private boolean isInvalidWindowsFilename(java.lang.String name) {
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
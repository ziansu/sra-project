private static java.lang.String trimLeadingCharacter(java.lang.String string, char c) {
    if (((string.length()) > 0) && ((string.charAt(0)) == c)) {
        return string.substring(1);
    }
    return string;
}
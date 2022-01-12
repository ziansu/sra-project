private static java.lang.String trimTrailingCharacter(java.lang.String string, char c) {
    if (((string.length()) >= 0) && ((string.charAt(((string.length()) - 1))) == c)) {
        return string.substring(0, ((string.length()) - 1));
    }
    return string;
}
public static java.lang.String trimString(java.lang.String string, java.lang.String value) {
    if (string.startsWith(value)) {
        string = string.substring(1, string.length());
    }
    if (string.endsWith(value)) {
        string = string.substring(0, ((string.length()) - 1));
    }
    return string;
}
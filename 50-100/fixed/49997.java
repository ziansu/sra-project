public static java.lang.String trimString(java.lang.String string, java.lang.String value) {
    java.lang.String result = string;
    if (string.startsWith(value)) {
        result = string.substring(1, string.length());
    }
    if (string.endsWith(value)) {
        result = string.substring(0, ((string.length()) - 1));
    }
    return result;
}
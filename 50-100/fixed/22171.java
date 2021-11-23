public static java.lang.String arrayToSeparatedString(final java.lang.String[] strings, final java.lang.String separator) {
    if (strings != null) {
        final java.lang.StringBuilder result = new java.lang.StringBuilder();
        for (int i = 0; i < (strings.length); i++) {
            result.append(strings[i]);
            if ((i + 1) < (strings.length)) {
                result.append(separator);
            }
        }
        return result.toString();
    }
    return "";
}
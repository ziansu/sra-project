public static java.lang.String removeHeading(java.lang.String source, java.lang.String toRemove) {
    if (toRemove == null) {
        return source;
    }
    source = source.trim();
    int toRemoveLength = toRemove.length();
    if (((source.length()) >= toRemoveLength) && (toRemove.equals(source.substring(0, toRemoveLength)))) {
        source = source.substring(toRemoveLength, source.length());
    }
    return source;
}
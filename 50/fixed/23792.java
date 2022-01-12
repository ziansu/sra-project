private static java.lang.String removeSubstring(java.lang.String from, java.lang.String substring) {
    java.lang.String firstReplace = from.replaceFirst(substring, " ");
    return firstReplace;
}
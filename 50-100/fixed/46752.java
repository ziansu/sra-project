public static java.lang.String replaceLast(java.lang.String string, java.lang.String toReplace, java.lang.String replacement) {
    int pos = string.lastIndexOf(toReplace);
    return pos == (-1) ? string : ((string.substring(0, pos)) + replacement) + (string.substring((pos + (toReplace.length())), string.length()));
}
public static java.lang.String replaceLast(java.lang.String string, java.lang.String toReplace, java.lang.String replacement) {
    int pos = string.lastIndexOf(toReplace);
    if (pos > (-1)) {
        return ((string.substring(0, pos)) + replacement) + (string.substring((pos + (toReplace.length())), string.length()));
    }else {
        return string;
    }
}
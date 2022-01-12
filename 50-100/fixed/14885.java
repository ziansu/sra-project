public static java.lang.String join(java.lang.String[] array, java.lang.Character c) {
    if (c == null) {
        c = ' ';
    }
    java.lang.String string = "";
    for (java.lang.String s : array) {
        string = string.concat((s + c));
    }
    if (string.isEmpty()) {
        return "";
    }
    return string.substring(0, ((string.length()) - 1));
}
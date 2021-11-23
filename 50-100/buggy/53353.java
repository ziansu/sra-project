public static java.lang.String join(java.util.List<?> list, java.lang.Character c) {
    java.lang.String string = "";
    for (java.lang.Object t : list) {
        string = string.concat(((t.toString()) + c));
    }
    return string.substring(0, ((string.length()) - 1));
}
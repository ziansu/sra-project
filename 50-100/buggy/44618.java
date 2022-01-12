public static java.lang.String join(java.util.List<?> list, java.lang.String separator) {
    java.lang.String string = "";
    for (java.lang.Object t : list) {
        string = string.concat(((t.toString()) + separator));
    }
    return string.substring(0, ((string.length()) - (separator.length())));
}
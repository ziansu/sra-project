public static final java.lang.String removeBrackets(final java.lang.String listString) {
    if ((listString.startsWith("[")) && (listString.endsWith("]"))) {
        return listString.substring(1, ((listString.length()) - 1));
    }else {
        return listString;
    }
}
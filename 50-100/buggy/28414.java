public static final java.lang.String removeBrackets(final java.lang.String listString) {
    java.lang.String noBracketsString = null;
    if ((listString.startsWith("[")) && (listString.endsWith("]"))) {
        noBracketsString = listString.substring(1, ((listString.length()) - 1));
        return noBracketsString;
    }else {
        return listString;
    }
}
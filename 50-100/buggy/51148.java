public static boolean isEmpty(final java.lang.String strValue) {
    if (strValue == null) {
        return true;
    }
    for (int i = 0; i < (strValue.length()); i++) {
        if (java.lang.Character.isWhitespace(strValue.charAt(i))) {
            return false;
        }
    }
    return true;
}
public static boolean isNullorNill(java.lang.String string) {
    if (((string == null) || (string.equals(""))) || (string.equals("null"))) {
        return true;
    }
    return false;
}
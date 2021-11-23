public static boolean isNull(java.lang.String string) {
    if ((string == null) && ("".equals(string))) {
        return false;
    }
    return true;
}
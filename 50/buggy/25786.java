public static boolean isEmptyOrNull(java.lang.String str) {
    boolean stringEN = false;
    if ((str.trim().isEmpty()) || (str == null)) {
        stringEN = true;
    }
    return stringEN;
}
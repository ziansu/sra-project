public static boolean isEmptyOrNull(java.lang.String str) {
    boolean stringEN = false;
    if ((str == null) || (str.trim().isEmpty())) {
        stringEN = true;
    }
    return stringEN;
}
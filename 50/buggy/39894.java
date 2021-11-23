public static java.lang.String removeAllNonNumeric(java.lang.String str) {
    return str.trim().replaceAll("[^\\d.]", "");
}
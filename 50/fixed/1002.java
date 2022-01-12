private static boolean isNumeric(java.lang.String str) {
    try {
        java.lang.Integer.parseInt(str);
    } catch (java.lang.NumberFormatException nfe) {
        return false;
    }
    return true;
}
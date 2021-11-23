public static boolean isInt(java.lang.String str) {
    try {
        java.lang.Integer.parseInt(str);
    } catch (java.lang.NumberFormatException nfe) {
        return false;
    }
    return true;
}
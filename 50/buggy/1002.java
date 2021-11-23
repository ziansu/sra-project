private static boolean isNumeric(java.lang.String str) {
    try {
        int i = java.lang.Integer.parseInt(str);
    } catch (java.lang.NumberFormatException nfe) {
        return false;
    }
    return true;
}
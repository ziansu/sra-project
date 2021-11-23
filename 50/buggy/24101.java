public static boolean isDouble(java.lang.String str) {
    try {
        double d = java.lang.Double.parseDouble(str);
    } catch (java.lang.NumberFormatException nfe) {
        return false;
    }
    return true;
}
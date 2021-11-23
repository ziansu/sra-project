public static boolean isInt(java.lang.String s) {
    try {
        java.lang.Integer.parseInt(s.trim());
        return true;
    } catch (java.lang.NumberFormatException e) {
        return false;
    }
}
public static boolean validateYear(java.lang.String year) {
    if (Main.isInteger(year)) {
        if (((java.lang.Integer.parseInt(year)) > 1900) && ((java.lang.Integer.parseInt(year)) < 2000)) {
            return true;
        }
    }
    return false;
}
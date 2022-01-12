public static boolean validateMonth(java.lang.String month) {
    if (Main.isInteger(month)) {
        if (((java.lang.Integer.parseInt(month)) < 13) && ((java.lang.Integer.parseInt(month)) > 0)) {
            return true;
        }
    }
    return false;
}
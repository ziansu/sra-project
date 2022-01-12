public static java.lang.Double parseDouble(java.lang.String s) throws java.lang.NumberFormatException, java.text.ParseException {
    java.text.NumberFormat format = java.text.NumberFormat.getInstance(java.util.Locale.FRANCE);
    if ((s.length()) != 0) {
        java.lang.Number number = format.parse(s);
        return number.doubleValue();
    }
    return ((double) (0));
}
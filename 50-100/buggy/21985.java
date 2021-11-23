public static java.lang.Double parseDouble(java.lang.String s) {
    try {
        java.text.NumberFormat format = java.text.NumberFormat.getInstance(java.util.Locale.FRANCE);
        java.lang.Number number = format.parse(s);
        return number.doubleValue();
    } catch (java.lang.NumberFormatException | java.text.ParseException e) {
        return null;
    }
}
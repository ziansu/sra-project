private double convertToUS(java.lang.String str) {
    java.text.NumberFormat format = java.text.NumberFormat.getInstance(java.util.Locale.FRANCE);
    java.lang.Number number = null;
    try {
        number = format.parse(str);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(((((("FormatParser : " + str) + " => ") + number) + " parsed => ") + (number.doubleValue())));
    return number.doubleValue();
}
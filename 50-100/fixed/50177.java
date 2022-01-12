private java.lang.String getRate(java.lang.Double number) {
    java.util.Locale locale = new java.util.Locale("en", "UK");
    java.lang.String pattern = "###.##";
    java.text.DecimalFormat decimalFormat = ((java.text.DecimalFormat) (java.text.NumberFormat.getNumberInstance(locale)));
    decimalFormat.applyPattern(pattern);
    return decimalFormat.format(number);
}
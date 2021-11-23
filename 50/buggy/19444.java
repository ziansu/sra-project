private static double roundTwoDecimals(double d) {
    java.text.DecimalFormat twoDForm = new java.text.DecimalFormat("#.##");
    return java.lang.Double.valueOf(twoDForm.format(d));
}
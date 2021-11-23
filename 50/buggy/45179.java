private java.lang.String getDecimalString(double v) {
    java.text.DecimalFormat df = new java.text.DecimalFormat(mDecimalFormatString);
    return df.format(v);
}
public java.lang.Number getNumber(java.lang.String s) throws java.text.ParseException {
    return java.text.NumberFormat.getInstance().parse(s);
}
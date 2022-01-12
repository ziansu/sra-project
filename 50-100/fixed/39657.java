public java.util.Date convert(java.lang.String input) {
    java.util.Date date = null;
    try {
        java.text.DateFormat formatter = new java.text.SimpleDateFormat(format);
        date = ((java.util.Date) (formatter.parse(input)));
    } catch (java.text.ParseException e) {
        throw new java.text.com.tieto.parser.ParseException(e.getMessage(), e);
    }
    return date;
}
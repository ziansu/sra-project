private java.util.Date getFormattingDate(java.lang.String str) {
    java.util.Locale locale = new java.util.Locale("en", "UK");
    java.text.DateFormatSymbols dateFormatSymbols = new java.text.DateFormatSymbols(locale);
    dateFormatSymbols.setWeekdays(new java.lang.String[]{  });
    java.lang.String pattern = "E MMM dd HH:mm:ss z yyyy";
    try {
        java.time.format.DateTimeFormatter qwe = java.time.format.DateTimeFormatter.ofPattern(pattern, java.util.Locale.UK);
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern, dateFormatSymbols);
        java.util.Date date2 = sdf.parse(str);
        return date2;
    } catch (java.text.ParseException ex) {
        java.lang.System.out.print(ex);
        return null;
    }
}
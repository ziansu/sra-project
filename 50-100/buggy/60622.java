private java.util.GregorianCalendar formatStringToCalendar(java.lang.String str) {
    java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy MM dd HH:mm");
    java.util.Date date = null;
    try {
        date = fmt.parse(str);
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }
    java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("GMT+1");
    java.util.GregorianCalendar cal = new java.util.GregorianCalendar(timeZone);
    cal.setTime(date);
    return cal;
}
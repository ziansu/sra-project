private java.lang.String convertJbodateToString(java.util.Date domainDate) {
    if (domainDate == null) {
        return null;
    }
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
    java.util.Date date = null;
    try {
        date = ((java.util.Date) (formatter.parse(domainDate.toString().substring(0, 21))));
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    java.text.SimpleDateFormat FORMATTER = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    return FORMATTER.format(date);
}
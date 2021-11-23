private java.util.Date setDateFormat(java.lang.String sDate) {
    java.util.Date dDate = null;
    try {
        dDate = dateFormat.parse(sDate);
    } catch (java.text.ParseException e) {
        java.lang.System.err.println(("Fehler von String date to Date date: " + (e.getMessage())));
    }
    return dDate;
}
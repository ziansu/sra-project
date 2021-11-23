private java.util.Date setDateFormat(java.lang.String sDate) {
    try {
        java.util.Date dDate = dateFormat.parse(sDate);
        return dDate;
    } catch (java.text.ParseException e) {
        java.lang.System.err.println(("Fehler von String date to Date date: " + (e.getMessage())));
        return null;
    }
}
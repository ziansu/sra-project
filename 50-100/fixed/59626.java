private boolean checkDates(java.lang.String fromDate, java.lang.String toDate) {
    java.text.SimpleDateFormat fromDateFormat = new java.text.SimpleDateFormat("dd.MM.yyyy");
    java.util.Date fromDateconverted = new java.util.Date();
    java.text.SimpleDateFormat toDateFormat = new java.text.SimpleDateFormat("dd.MM.yyyy");
    java.util.Date toDateconverted = new java.util.Date();
    try {
        fromDateconverted = fromDateFormat.parse(fromDate);
        toDateconverted = toDateFormat.parse(toDate);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return !(toDateconverted.before(fromDateconverted));
}
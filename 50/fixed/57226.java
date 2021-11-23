private java.util.Date sqlDateToDate(java.lang.String sqlDate) {
    java.util.Date date = null;
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try {
        date = dateFormat.parse(sqlDate);
    } catch (java.text.ParseException e) {
    }
    return date;
}